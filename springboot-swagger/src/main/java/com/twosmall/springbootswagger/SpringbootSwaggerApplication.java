package com.twosmall.springbootswagger;

import com.twosmall.domain.TestSelfValue;
import com.twosmall.domain.TestValue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication(scanBasePackages = "com.twosmall")
@EnableConfigurationProperties({TestValue.class,TestSelfValue.class})
public class SpringbootSwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSwaggerApplication.class, args);
    }

}

