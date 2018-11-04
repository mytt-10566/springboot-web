package com.momo.springbootweb.listener.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

@WebListener
public class MoMoServletRequestListener implements ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("request init...");
        HttpServletRequest request = (HttpServletRequest) sre.getServletRequest();
        System.out.println(request.getRequestURL());
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("request destroy...");
    }
}
