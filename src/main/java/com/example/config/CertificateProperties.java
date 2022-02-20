package com.example.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("helsenorge.certificate.setting")
public class CertificateProperties {

    private boolean remoteValidation = false;
}
