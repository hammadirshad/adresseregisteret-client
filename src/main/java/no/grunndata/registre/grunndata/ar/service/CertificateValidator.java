package no.grunndata.registre.grunndata.ar.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import no.grunndata.registre.config.CertificateProperties;
import no.grunndata.registre.config.ProxyProperties;
import no.grunndata.registre.model.CertificateErrors;
import no.grunndata.registre.model.CertificateModel;
import no.grunndata.registre.utils.CertificateUtils;
import no.grunndata.registre.utils.keyUsageBitValue;
import org.springframework.stereotype.Service;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/**
 * Validates a certificate
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class CertificateValidator {

    private static final String KEY_USAGE_OID = "2.5.29.15";
    private final CertificateProperties certificateProperties;
    private final ProxyProperties proxyProperties;

    public CertificateErrors validateSigningCertificate(CertificateModel certificateModel) {
        return validate(certificateModel.getCertificate(), keyUsageBitValue.NON_REPUDIATION);
    }

    public CertificateErrors validateEncryptionCertificate(CertificateModel certificateModel) {
        return validate(certificateModel.getCertificate(), keyUsageBitValue.KEY_ENCIPHERMENT);
    }

    /**
     * Validates the provided certificate
     *
     * @param certificate The certificate to validate usage The type of usage the certificate is
     *                    specified for
     * @return A status indicating if the certificate is valid or not
     */
    public CertificateErrors validate(X509Certificate certificate, keyUsageBitValue keyUsageValue) {
        if (certificate == null) {
            return CertificateErrors.MISSING;
        }

        CertificateErrors result = CertificateErrors.NONE;

        if (new Date().before(certificate.getNotBefore())) {
            result = CertificateErrors.BEFORE_START_DATE;
        }
        if (new Date().after(certificate.getNotAfter())) {
            result = CertificateErrors.AFTER_END_DATE;
        }

        Set<String> criticalExtensionOIDs = certificate.getCriticalExtensionOIDs();
        if (criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty()) {
            for (String oid : criticalExtensionOIDs) {
                if (KEY_USAGE_OID.equals(oid)) {
                    boolean[] keyUsage = certificate.getKeyUsage();
                    if (keyUsage == null || !keyUsage[keyUsageValue.getBitValue()]) {
                        result = CertificateErrors.INCORRECT_USAGE;
                    }
                    break;
                }
            }
        }

        if (certificateProperties.isRemoteValidation()) {
            Proxy proxy = getProxy(proxyProperties);
            X509CRL x509CRL = CertificateUtils.getCRL(certificate, proxy);
            if (x509CRL != null) {
                boolean revoked = verify(x509CRL, certificate, new Date());
                if (revoked) {
                    result = CertificateErrors.REVOKED;
                }
            } else {
                result = CertificateErrors.REVOKED_UNKNOWN;
            }
        }
        return result;
    }

    public boolean verify(X509CRL crl, X509Certificate certificate, Date date) {
        if (crl.getIssuerX500Principal().equals(certificate.getIssuerX500Principal())
                && date.after(crl.getThisUpdate())
                && date.before(crl.getNextUpdate())) {
            return crl.isRevoked(certificate);
        }
        return false;
    }

    private Proxy getProxy(ProxyProperties proxyProperties) {
        if (proxyProperties.isEnabled()) {
            InetSocketAddress sa =
                    new InetSocketAddress(
                            proxyProperties.getHost(), proxyProperties.getPort());
            return new Proxy(Proxy.Type.HTTP, sa);
        }
        return null;
    }

}
