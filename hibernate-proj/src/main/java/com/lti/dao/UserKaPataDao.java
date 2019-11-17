package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.lti.model.Pata;
import com.lti.model.User;

public class UserKaPataDao {
 
	public void save(User us)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracletest");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		em.persist(us);
		tx.commit();
		em.close();
		emf.close();
	}
	
	public void save(Pata p)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracletest");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		em.persist(p);
		tx.commit();
		em.close();
		emf.close();
	}
	
	public User fetch(int Id)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracletest");
		EntityManager em=emf.createEntityManager();
		
		//find method generates select query
		User us=em.find(User.class, Id);
		
		
		em.close();
		emf.close();
		
		return us;
	}

	


}