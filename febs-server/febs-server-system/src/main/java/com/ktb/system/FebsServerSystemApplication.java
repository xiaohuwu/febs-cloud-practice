package com.ktb.system;

import com.ktb.common.annotation.EnableFebsAuthExceptionHandler;
import com.ktb.common.annotation.EnableFebsServerProtect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@EnableDiscoveryClient
@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableFebsAuthExceptionHandler
@EnableFebsServerProtect
public class FebsServerSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(FebsServerSystemApplication.class, args);
    }
}
