package com.twosmall.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "test.self")
@Data
@PropertySource("classpath:test.properties")
@Component
public class TestSelfValue {
    private String title;
}
