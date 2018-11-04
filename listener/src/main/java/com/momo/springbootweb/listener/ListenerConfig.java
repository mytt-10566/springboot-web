package com.momo.springbootweb.listener;

import com.momo.springbootweb.listener.listener.LuLuServletContextListener;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ListenerConfig {

    // 注册listener
    @Bean
    public ServletListenerRegistrationBean luLuFilter() {
        ServletListenerRegistrationBean registrationBean = new ServletListenerRegistrationBean();
        registrationBean.setListener(new LuLuServletContextListener());
        return registrationBean;
    }
}
