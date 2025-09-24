package com.telusko.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.model.Answer;
import com.telusko.model.Question;

public class Fetch
{

    public static void main(String[] args)
    {
        Configuration config = null;
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
        boolean flag=false;

        config=new Configuration();

        config.configure();

        sessionFactory=config.buildSessionFactory();

        session=sessionFactory.openSession();



        Question qa=session.get(Question.class, 1);
        System.out.println(qa);

        try
        {
            transaction=session.beginTransaction();
            //session.save(student);


//			session.persist(answer1);
//			session.persist(answer2);
            flag=true;

        }
        catch(HibernateException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        finally
        {
            if(flag==true)
            {
                transaction.commit();
            }
            else
            {
                transaction.rollback();
            }

            session.close();
            sessionFactory.close();

        }

    }

}
