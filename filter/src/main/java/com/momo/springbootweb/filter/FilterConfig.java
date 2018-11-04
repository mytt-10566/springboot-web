package com.momo.springbootweb.filter;

import com.momo.springbootweb.filter.filter.LuLuFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author MQG
 */
@Configuration
public class FilterConfig {

    // 注册Filter
    @Bean
    public FilterRegistrationBean luLuFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new LuLuFilter());
        registrationBean.addUrlPatterns("/lulu/*");
        return registrationBean;
    }
}
