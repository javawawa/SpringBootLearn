package com.twosmall.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix="test")
public class TestValue {
    private String title;
    private String value;
}
