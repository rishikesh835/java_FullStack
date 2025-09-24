package com.learning.app;


import com.learning.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import  org.hibernate.cfg.Configuration;

public class LaunchFirstApp {
    public static void main(String[] args) {
//        step1 Configuration Object
        Configuration config = new Configuration();
//        step2 - configure hibernate.cfg.xml file to the configuration object
        config.configure();
//        step3 Create sessionFactory Object
        SessionFactory sessionFactory = config.buildSessionFactory();
//        step4 Get the session object from sessionFactory
        Session session = sessionFactory.openSession();
//        step5 Begin the transaction within the session
          Transaction transaction =  session.beginTransaction();


//        step6 Insert the document into the database
        Student s = new Student();
        s.setSid(2);
        s.setsName("Aditya");
        s.setCity("jaiput");

        session.persist(s);

//        step7 commit the transaction
        transaction.commit();
//        step8 close the resources
        session.close();
    }
}
