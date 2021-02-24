package com.buckwheat.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
@SpringBootApplication
@EnableDubbo
public class OrderMainApplication {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(OrderMainApplication.class,args);
    }
}
