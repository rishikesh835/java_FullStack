package com.learning;

import jakarta.servlet.http.HttpServlet;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.Servlet;

import static java.lang.Class.forName;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws LifecycleException, ClassNotFoundException {
        System.out.println( "Hello World!" );
        Tomcat tomcat = new Tomcat();
//        HttpServlet.forClassName();
        Class.forName("HttpServlet");

        Context context = tomcat.addContext("",null);
        Tomcat.addServlet(context,"HelloServlet", (Servlet) new HelloServlet());
        context.addServletMappingDecoded("/hello","HelloServlet");


        tomcat.start();
        tomcat.getServer().await();

    }
}
