package com.momo.springbootweb.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.momo.springbootweb.listener.listener")
public class ListenerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ListenerApplication.class, args);
    }
}
