package com.cl.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 执行post请求时，localhost:8881/bus/refresh
 * 会读取最新的配置信息，但不会刷新上下文中的配置值，
 * 需要在使用配置值类上面添加RefreshScope注解
 * /bus/refresh，请求时，提示权限限制，
 * 在配置文件中添加如下配置，关闭验证
 * management.security.enabled=false
 *
 */
@SpringBootApplication
@RestController
@RefreshScope
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }
    
    @Value("${foo}")
    String foo;
    
    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}