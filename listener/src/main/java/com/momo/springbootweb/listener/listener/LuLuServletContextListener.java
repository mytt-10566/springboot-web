package com.momo.springbootweb.listener.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Enumeration;

public class LuLuServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContext init...");

        ServletContext servletContext = sce.getServletContext();
        Enumeration<String> initParameterNames = servletContext.getInitParameterNames();
        while (initParameterNames.hasMoreElements()) {
            String paramName = initParameterNames.nextElement();
            System.out.println(paramName + ":" + servletContext.getInitParameter(paramName));
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContext destroy...");
    }
}
