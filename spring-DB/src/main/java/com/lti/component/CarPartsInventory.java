package com.lti.component;
/**
 * @author Priyanka 
 * @Date 13/11/19
 */

import java.sql.SQLException;
import java.util.List;

import com.lti.MyException.CarPartException;

public interface CarPartsInventory
{
	public void addNewPart(CarPart carPart)throws CarPartException;//, ClassNotFoundException,SQLException;
	public List<CarPart> getAvailableParts() throws CarPartException;
	
}
