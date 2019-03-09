package com.companyname.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.companyname.model.Product;

public class ProductDao {
	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	//method to save prodcut  
	public void saveProduct(Product p){  
		Session session =sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(p);  
		transaction.commit();
	} 
}
