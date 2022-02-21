package com.example.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Information required when communicating with the address registry
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ConfigurationProperties("address.registry")
public class AddressRegistryProperties {

    private RequestMode requestMode = RequestMode.HTTP;
    /**
     * Username used for connecting
     */
    private String username;

    /**
     * Password used for connecting
     */
    private String password;

    /**
     * The endpoint found in the WCF configuration
     */
    private String arEndpoint;

    private String cppEndpoint;

    public enum RequestMode {
        HTTP,
        SOAP
    }
}
