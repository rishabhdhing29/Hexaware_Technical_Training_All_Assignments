package com.hexaware.hibernate;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hibernate.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


    SessionFactory sessionFactory =	HibernateUtil.getSessionFactory();
    
    		System.out.println(sessionFactory);
    		
    		Session session =		sessionFactory.openSession();
    		
    			Transaction tr =	session.beginTransaction();
    		
    			Employee emp = new Employee(101, "Javeed", 30000);
    			
    			Serializable ser =		session.save(emp);
    			
    			System.out.println(ser.toString() +"record inserted");
    		
    				tr.commit();
    		
    
    	
    }
}
