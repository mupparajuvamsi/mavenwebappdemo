package com.companyname.dao;
//import org.springframework.orm.hibernate3.HibernateTemplate;  
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.companyname.model.Employee;
//@Transactional(readOnly = false)
public class EmployeeDao {  
SessionFactory sessionFactory;
public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
}

//method to save employee  
public void saveEmployee(Employee e){  
	Session session =sessionFactory.openSession();
	Transaction transaction = session.beginTransaction();
	session.save(e);  
	transaction.commit();
}  
//method to update employee  
public void updateEmployee(Employee e){  
	Session session =sessionFactory.openSession();
	Transaction transaction = session.beginTransaction();
	transaction.commit();
	session.update(e);  
}  
//method to delete employee  
public void deleteEmployee(Employee e){  
	sessionFactory.openSession().delete(e);  
}  
//method to return one employee of given id  
public Employee getById(int id){  
    Employee e=(Employee)sessionFactory.openSession().get(Employee.class,id);  
    return e;  
}  
//method to return all employees  
public List<Employee> getEmployees(){  
    List<Employee> list=sessionFactory.openSession().createCriteria(Employee.class).list();
    return list;  
}  
}  