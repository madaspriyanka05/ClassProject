package com.lti.component;
import javax.persistence.*;
/**
 * @author Divyanshu 
 * @Date 13/11/19
 */


@Entity
@Table(name="TBL_CARPART")
public class CarPart 
{
	@Id
	private int partNo;
	
	private String partName;
	private String carModel;
	private double quantity;
	private double price; 

	
	public int getPartNo() {
		return partNo;
	}

	public void setPartNo(int partNo) {
		this.partNo = partNo;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	

}
