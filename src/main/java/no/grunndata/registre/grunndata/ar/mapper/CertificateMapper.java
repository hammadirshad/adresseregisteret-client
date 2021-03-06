package no.grunndata.registre.grunndata.ar.mapper;

import lombok.extern.slf4j.Slf4j;
import no.grunndata.registre.model.CertificateModel;
import no.grunndata.registre.schema.ar.CertificateDetails;
import no.grunndata.registre.utils.CertificateUtils;
import org.springframework.stereotype.Service;

import java.security.cert.X509Certificate;

@Slf4j
@Service
public class CertificateMapper {

    public CertificateModel mapToCertificateModel(CertificateDetails certificateDetails) {
        CertificateModel certificateModel =
                new CertificateModel(
                        certificateDetails.getLdapUrl().getValue(),
                        certificateDetails.getCertificate().getValue());
        try {
            X509Certificate x509Certificate =
                    CertificateUtils.getX509Certificate(certificateDetails.getCertificate().getValue());
            certificateModel.setCertificate(x509Certificate);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        return certificateModel;
    }
}
