package com.example.config;

import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.DefaultProxyRoutePlanner;
import org.apache.http.protocol.HttpContext;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @ConditionalOnMissingBean(RestTemplateBuilder.class)
    @Bean
    public RestTemplateBuilder restTemplateBuilder() {
        return new RestTemplateBuilder();
    }

    @Bean
    public RestTemplate restTemplate(
            RestTemplateBuilder restTemplateBuilder, ProxyProperties proxyProperties) {
        if (proxyProperties.isEnabled()) {
            withNHNProxy(restTemplateBuilder, proxyProperties);
        }
        return restTemplateBuilder.build();
    }

    private void withNHNProxy(
            RestTemplateBuilder restTemplateBuilder, ProxyProperties proxyProperties) {
        restTemplateBuilder.customizers(
                restTemplate -> {
                    CloseableHttpClient httpClient =
                            HttpClientBuilder.create()
                                    .setRoutePlanner(
                                            new DefaultProxyRoutePlanner(
                                                    new HttpHost(
                                                            proxyProperties.getHost(),
                                                            proxyProperties.getPort())) {
                                                @Override
                                                public HttpHost determineProxy(
                                                        HttpHost target, HttpRequest request, HttpContext context)
                                                        throws HttpException {
                                                    return super.determineProxy(target, request, context);
                                                }
                                            })
                                    .build();
                    restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory(httpClient));
                });
    }
}
