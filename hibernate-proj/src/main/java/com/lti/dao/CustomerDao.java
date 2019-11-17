package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.model.Customer;

//Data Access Object - Design Pattern
public class CustomerDao 
{
	public void save(Customer customer)
	{
		//Step1. Load/Create EntitymanagerFactory object
		//During this step META-INF/persistence.xml
		//file will be read automatically
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracletest");
//		
//		//Step2. Load/Create EntityManager object
		EntityManager em=emf.createEntityManager();
//		
//		//Step3. Participate/Start a transaction
		EntityTransaction tx=em.getTransaction();
		tx.begin();
//		
//		
//		//now we can insert/delete whatever we want
//		//persist method generates insert query for us 
		em.persist(customer);
//		
//		
//		
		tx.commit();
//		
//		
		em.close();
		emf.close();
	}

	public Customer fetch(int custId)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracletest");
		EntityManager em=emf.createEntityManager();
		
		//find method generates select query
		Customer cust=em.find(Customer.class, custId);
		
		
		em.close();
		emf.close();
		
		return cust;
	}
	

	public List<Customer> fetchByCity(String city)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracletest");
		EntityManager em = emf.createEntityManager();
		
		Query q=em.createQuery("Select c from Customer as c where c.custCity=:ct");
		q.setParameter("ct", city);
		List <Customer> customers=q.getResultList();
		
		em.close();
		emf.close();
		return customers;
		
	}
	
	

	
	public void  removeByCity(String city)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracletest");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		
		Query query = em.createNativeQuery("select FROM Customer WHERE custCity= :ct");
		query.setParameter("ct",city);
		List <Customer> customers = query.getResultList();
		
		
		
		
		//now we can insert/delete whatever we want
		//persist method generates insert query for us 
		for(Customer c1 :customers){
		em.remove(c1);}

		/*
		Query query= em.createQuery("Select a From Customer a");
				 List <Customer> customers1 = query.getResultList();
				 for(Customer c1 :customers1){
			System.out.println(c1);
		}*/
		tx.commit();
		
		em.close();
		emf.close();
		

		
	}
}

	
	
