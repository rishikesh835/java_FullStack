package com.learning;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


//@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res){
        System.out.println("service method");
        try {
            Class.forName("HttpServlet");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
