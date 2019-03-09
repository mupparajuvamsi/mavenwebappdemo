package com.tecmax.demo.mavenhibernateexample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.companyname.dao.ProductDao;
import com.companyname.model.Product;

public class InsertTest {
	public static void main(String[] args) {

		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);

//		EmployeeDao dao = (EmployeeDao) factory.getBean("d");
//
//		Employee e = new Employee();
//		e.setId(200);
//		e.setName("vamsi");
//		e.setSalary(50000);
//
//		dao.saveEmployee(e);
		ProductDao productDao=(ProductDao) factory.getBean("productDao");
		Product product=new Product();
		product.setId(101);
		product.setName("Apple");
		productDao.saveProduct(product);
		System.out.println("done........");
	}
}