package com.example.grunndata.ar.service;

import com.example.config.CertificateProperties;
import com.example.config.ProxyProperties;
import com.example.model.CertificateErrors;
import com.example.model.CertificateModel;
import com.example.utils.CertificateUtils;
import com.example.utils.keyUsageBitValue;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
        return validate(certificateModel.getCertificate(), keyUsageBitValue.nonRepudiation);
    }

    public CertificateErrors validateEncryptionCertificate(CertificateModel certificateModel) {
        return validate(certificateModel.getCertificate(), keyUsageBitValue.dataEncipherment);
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
            return CertificateErrors.Missing;
        }

        CertificateErrors result = CertificateErrors.None;

        if (new Date().before(certificate.getNotBefore())) {
            result = CertificateErrors.StartDate;
        }
        if (new Date().after(certificate.getNotAfter())) {
            result = CertificateErrors.EndDate;
        }

        Set<String> criticalExtensionOIDs = certificate.getCriticalExtensionOIDs();
        if (criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty()) {
            for (String oid : criticalExtensionOIDs) {
                if (KEY_USAGE_OID.equals(oid)) {
                    boolean[] keyUsage = certificate.getKeyUsage();
                    if (keyUsage == null || !keyUsage[keyUsageValue.getBitValue()]) {
                        result = CertificateErrors.Usage;
                    }
                    break;
                }
            }
        }

        if (certificateProperties.isRemoteValidation()) {
            Proxy proxy = null;
            if (proxyProperties.isProxyEnabled()) {
                InetSocketAddress sa =
                        new InetSocketAddress(
                                proxyProperties.getProxyHost(), proxyProperties.getProxyPort());
                proxy = new Proxy(Proxy.Type.HTTP, sa);
            }
            X509CRL x509CRL = CertificateUtils.getCRL(certificate, null);
            if (x509CRL != null) {
                boolean revoked = verify(x509CRL, certificate, new Date());
                if (revoked) {
                    result = CertificateErrors.Revoked;
                }
            } else {
                result = CertificateErrors.RevokedUnknown;
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
}
