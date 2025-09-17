package com.learning.mvcproject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet("/Register")
public class Register extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("uname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String city = request.getParameter("ucity");

        Model m = new Model();
        m.setEmail(email);
        m.setUname(name);
        m.setUpassword(password);
        m.setUcity(city);

        int row = m.register();

        HttpSession session = request.getSession();
        session.setAttribute("name", name);
        if(row == 0){
            response.sendRedirect("failure.jsp");
        }else{
            response.sendRedirect("success.jsp");
        }

    }

}
