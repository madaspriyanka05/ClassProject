package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.dao.CustomerDao;
import com.lti.model.Customer;

public class CustomerTest {

	@Test
	public void test() {			//Test case #1+
		//fail("Not yet implemented");
		Customer cust=new Customer();
		cust.setCustName("Zac");
		cust.setCustCity("Alexandria");

		CustomerDao dao = new CustomerDao();
		dao.save(cust);
	}
	
	@Test(expected=NullPointerException.class)
	public void fetchById(){
		CustomerDao dao = new CustomerDao();
		Customer cust = dao.fetch(61);
		assertNotNull( cust);
		//No println statement, We should use assert method instead
		//System.out.println(cust.getCustName());
		//System.out.println(cust.getCustCity());
		
		
	}
	
	
}
