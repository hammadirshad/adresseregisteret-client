package com.example.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("nhn.environment")
public class ProxyProperties {
    private boolean proxyEnabled = false;

    private String proxyHost;

    private int proxyPort;
}
