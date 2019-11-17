package com.lti.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity									
@Table(name = "TBL_CUST")				//specifying the Table name
public class Customer {
	
	
	@Id  								//primary key 
	@GeneratedValue 					//generates random number for custId
	@Column(name="CUST_ID") 			//specifying the column name
	int custId;
	
	@Column(name="CUST_NAME")
	String custName;
	
	
	@Column(name="CUST_CITY")
	String custCity;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custCity=" + custCity + "]";
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustCity() {
		return custCity;
	}
	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}
	
}
