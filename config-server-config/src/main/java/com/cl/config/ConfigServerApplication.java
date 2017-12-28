package com.cl.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
/**
 * http请求地址和资源文件映射如下:
 * 
 * /{application}/{profile}[/{label}] 
 * /{application}-{profile}.yml
 * /{label}/{application}-{profile}.yml 
 * /{application}-{profile}.properties
 * /{label}/{application}-{profile}.properties
 *
 * 本项目实例：http://localhost:8888/config-client/dev
 */
