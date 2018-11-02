package com.momo.springbootweb.springbootweb.root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;

/**
 * @author: MQG
 * @date: 2018/11/2
 */
@Configuration
public class MessageConverterConfig {

    @Autowired
    private JsonHttpMessageConverter jsonHttpMessageConverter;
    
    @Bean
    public HttpMessageConverters customConverters() {
        return new HttpMessageConverters(jsonHttpMessageConverter);
    }
}
