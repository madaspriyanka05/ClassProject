package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity									
@Table(name = "TBL_Person")

public class Person
{
	@Id  								//primary key 
	@GeneratedValue 	
	private int id;
	private String name;
	private int age;
  
	@OneToOne(mappedBy="person" )
	
	private Passport passport;
}
