package com.learning.app;

import com.learning.model.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LaunchUpdate {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
        Session session = null;
        Transaction tx = null;
        boolean flag = false;
        try {
            session = sessionFactory.openSession();
            tx = session.beginTransaction();
            Student student = new Student();
            student.setSid(2);
            student.setsName("Rohan");
            student.setCity("Indore");

            session.merge(student);
            flag = true;
        } catch (HibernateException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(flag == true){
                tx.commit();
            }else{
                tx.rollback();
            }
            session.close();
        }
    }
}
