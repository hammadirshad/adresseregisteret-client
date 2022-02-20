package com.example.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("proxy")
public class ProxyProperties {
    private boolean enabled = false;

    private String host;

    private int port;
}
