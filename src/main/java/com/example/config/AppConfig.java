package com.example.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({
        ProxyProperties.class,
        AddressRegistryProperties.class,
        CollaborationProtocolRegistryProperties.class
})
public class AppConfig {


}
