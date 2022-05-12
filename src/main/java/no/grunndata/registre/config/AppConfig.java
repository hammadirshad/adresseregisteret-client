package no.grunndata.registre.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({
        ProxyProperties.class,
        AddressRegistryProperties.class,
        CertificateProperties.class,
})
public class AppConfig {


}
