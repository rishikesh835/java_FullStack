package com.learning.demoservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/formServlet")
public class formServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("uname");
        String city = req.getParameter("ucity");
//       PrintWriter writer = resp.getWriter();
//       writer.println("Hello" + name);
//       writer.println("you live in the " + city);
//       writer.close();

        resp.sendRedirect("new/success.jsp");
    }

}
