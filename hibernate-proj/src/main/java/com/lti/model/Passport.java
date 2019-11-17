package com.lti.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TBL_PASSPORT")
public class Passport 
{
	@Id
	private String passportno;
	private String country;
	private LocalDate issueDate;
	private LocalDate expiryDate;

	@OneToOne
	@JoinColumn(name = "P_ID")// name of the foreign key
	private Person person;
}
