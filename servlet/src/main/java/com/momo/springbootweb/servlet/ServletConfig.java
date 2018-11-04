package com.momo.springbootweb.servlet;

import com.momo.springbootweb.servlet.servlet.LuLuServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @author Mo Qing Gen
 */
@Configuration
public class ServletConfig {

    // 方式二 ServletRegistrationBean添加Servlet
    @Bean
    public ServletRegistrationBean luluServletBean() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(new LuLuServlet());
        servletRegistrationBean.setUrlMappings(Arrays.asList("/lulu/*"));
        return servletRegistrationBean;
    }
}
