package com.rtpl.common;

import org.hibernate.Session;

import com.rtpl.persistence.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        Stock stock = new Stock();
        
        stock.setStockCode("1234");
        stock.setStockName("neha");
        
        //session.save(stock);
       
        
        
        //session.delete(stock);
        
        session.getTransaction().commit();
    }
}
