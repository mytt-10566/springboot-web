package com.momo.springbootweb.servlet.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author MQG
 * <p>
 * 方式一 使用@WebServlet + @ServletComponentScan(basePackages = "com.momo.springbootservlet.servlet")
 * 方式二 注册为Bean
 */
@WebServlet(name = "MoMoServlet", urlPatterns = "/momo/*")
public class MoMoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Servlet...");

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.append("MoMoServlet Response... 小明");
        writer.flush();
        writer.close();
    }
}
