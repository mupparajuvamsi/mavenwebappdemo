package com.tecmax.demo.mavenhibernateexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.companyname.model.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		Student student = new Student(101, "vamsi", 101);
		session.save(student);
		transaction.commit();
		session.close();
	}
}
