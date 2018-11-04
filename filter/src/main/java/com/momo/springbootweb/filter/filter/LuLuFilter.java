package com.momo.springbootweb.filter.filter;

import javax.servlet.*;
import java.io.IOException;

public class LuLuFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("LuLuFilter过滤器初始化。。。");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("LuLuFilter进入过滤器，正常执行。。。");
    }

    @Override
    public void destroy() {
        System.out.println("LuLuFilter过滤器销毁。。。");
    }
}
