package com.lti.test;

import org.junit.Test;
import com.lti.dao.UserKaPataDao;

import com.lti.model.Pata;
import com.lti.model.User;

public class UserKaPataTest {
	
//	@Test
//	public void testInsert() {	
//		
//		User us = new User();
//		us.setNaam("Adolf Hitler");
//		us.setEmail("iamGermaNazi@gmail.com");
//		us.setPassword("WishIWasDead");
//		
//		UserKaPataDao dao = new UserKaPataDao();
//		dao.save(us);
//	}
//	@Test
//	public void fetchById(){
//		UserKaPataDao dao = new UserKaPataDao();
//		User us = dao.fetch(105);
//		assertNotNull(us);
//		//No println statement, We should use assert method instead
//		System.out.println(us.getNaam());
//		System.out.println(us.getEmail());
//		System.out.println(us.getPassword());
//		}
	
	@Test
	public void addAddressForAnExistingUser(){
		UserKaPataDao dao=new UserKaPataDao();
		User us=dao.fetch(105);
		Pata pt=new Pata();
		pt.setPin(254800);
		pt.setSheherKaNaam("Delhi");
		pt.setKamraNo("450");
		pt.setGaliKaNaam("Dwarka Nagar");
		pt.setUserKiId(us);
		dao.save(pt);		
	}
	
	
	@Test
	public void addUserAlongWithAddress(){
		
		//Adding a newuser 
		User us = new User();
		us.setNaam("Priyanka Madas");
		us.setEmail("abc123@gmail.com");
		us.setPassword("Abirthdaycake");
		
		UserKaPataDao dao = new UserKaPataDao();
		//dao.save(us);
		//fetching the user 
		//User u1=dao.fetch(us.getId());
		Pata p1=new Pata();
		p1.setPin(123456);
		p1.setSheherKaNaam("Rajasthan");
		p1.setKamraNo("421");
		p1.setGaliKaNaam("City Palace");
		p1.setUserKiId(us);
		dao.save(p1);		
		
		
		
	} 
	
}
	