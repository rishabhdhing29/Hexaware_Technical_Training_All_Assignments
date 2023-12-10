package com.hexaware.hibernateApp;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hibernateApp.HibernateAppUtil;
import com.hexaware.hibernateApp.entity.Order;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory =	HibernateAppUtil.getSessionFactory();
        
		System.out.println(sessionFactory);
		
		Session session =		sessionFactory.openSession();
		
			Transaction tr =	session.beginTransaction();
		
			Order emp = new Order(101, 1001, 30000);
			
			Serializable ser =		session.save(emp);
			
			System.out.println(ser.toString() +"record inserted");
		
				tr.commit();
    }
}
