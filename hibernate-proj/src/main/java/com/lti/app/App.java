package com.lti.app;

import java.util.List;

import com.lti.dao.CustomerDao;
import com.lti.model.Customer;

public class App 
{
	    
	public static void main(String []args){ 
	
//		Customer ob=new Customer();
//		ob.setCustName(name);
//		ob.setCustCity(city);
//		CustomerDao ob1=new CustomerDao();
//		ob1.save(ob);
//		CustomerDao ob2=new CustomerDao();
//		Customer cust=ob2.fetch(21);
//		System.out.println(cust.getCustName());
//		System.out.println(cust.getCustCity());
//		
//		CustomerDao dao = new CustomerDao();
//		List<Customer> custs = dao.fetchByCity("Mumbai");
//		for(Customer c: custs)
//		{
//			System.out.println("Id:="+c.getCustId()+"   Name:="+c.getCustName()+"   City:="+c.getCustCity());
//		}
//		
		CustomerDao dao = new CustomerDao();
		dao.removeByCity("US");
		
		}
}
