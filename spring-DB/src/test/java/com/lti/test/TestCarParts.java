package com.lti.test;



import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.omg.CORBA.SystemException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.MyException.CarPartException;
import com.lti.component.CarPart;
import com.lti.component.CarPartsInventory;

public class TestCarParts {

	@Test
	public void test1() 
	{
	   ApplicationContext ctx= new ClassPathXmlApplicationContext("app-config.xml");
	   CarPartsInventory cp=(CarPartsInventory) ctx.getBean("cpi2");
	   //Entity or models  instances are  not created using Spring
	  CarPart c=new CarPart();
	  c.setPartNo(119);
	  c.setPartName("engine");
	  c.setCarModel("verna");
	  c.setQuantity(4);
	  c.setPrice(5000);
	  try{
	 cp.addNewPart(c);
	  }catch( CarPartException e){System.out.println(""+e);}
 }

	
	@Test
	public void test2() 
	{
	   ApplicationContext ctx= new ClassPathXmlApplicationContext("app-config.xml");
	   CarPartsInventory cp=(CarPartsInventory) ctx.getBean("cpi2");
	   try 
	  {
		  
		  List<CarPart> list=new ArrayList<CarPart>();
		  list=cp.getAvailableParts();
			for(CarPart a1 :list)
			 {
				 	System.out.println("PartNo=  "+a1.getPartNo()+"  PartName="+a1.getPartName()+"   CarMode="+a1.getCarModel()+"   Quantity="+a1.getQuantity()+"  Price="+a1.getPrice());
			 }
		 
	  } catch (CarPartException e) {System.out.println("My Class Exception"+e);}
	  
	  
	}
}
