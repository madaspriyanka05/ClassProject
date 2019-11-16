package com.lti.component;

/**
 * @author Priyanka 
 * @Date 14/11/19
 */

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.MyException.CarPartException;



@Component("cpi3")
public class CarPartsInventoryImp4 implements CarPartsInventory {
	
	@PersistenceContext  //Autowired doesn't work for injecting EntityManager Object hence, we use PeristenceContext
	private EntityManager entityManager;
	
	@Transactional		//Used to add the transactional code as DML operations doesn't work without a transaction 
	public void addNewPart(CarPart carPart) throws CarPartException {
		entityManager.persist(carPart);
}

	public List<CarPart> getAvailableParts() throws CarPartException 
	{
		Query q = entityManager.createQuery("Select c from CarParts c");
		return q.getResultList();
	}
}