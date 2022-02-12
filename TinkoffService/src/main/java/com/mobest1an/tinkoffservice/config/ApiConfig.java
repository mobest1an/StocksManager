package com.mobest1an.tinkoffservice.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "api")
public class ApiConfig {

    private boolean isSandBoxMode;
}
