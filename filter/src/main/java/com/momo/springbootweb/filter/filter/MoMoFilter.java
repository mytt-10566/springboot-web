package com.momo.springbootweb.filter.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "MoMoFilter", urlPatterns = "/momo/*")
public class MoMoFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MoMoFilter 过滤器初始化。。。");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("MoMoFilter 进入过滤器，正常执行。。。");
    }

    @Override
    public void destroy() {
        System.out.println("MoMoFilter 过滤器销毁。。。");
    }
}
