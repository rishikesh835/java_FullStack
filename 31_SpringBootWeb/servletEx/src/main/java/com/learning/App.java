package com.learning;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import com.learning.HelloServlet;
import javax.servlet.Servlet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LifecycleException {
        System.out.println( "Hello World!" );
        Tomcat tomcat = new Tomcat();


        Context context = tomcat.addContext("",null);
        Tomcat.addServlet(context,"HelloServlet",(Servlet) new HelloServlet());
        context.addServletMappingDecoded("/hello","HelloServlet");


        tomcat.start();
        tomcat.getServer().await();


    }
}
