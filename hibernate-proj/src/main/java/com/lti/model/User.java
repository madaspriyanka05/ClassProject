package com.lti.model;

//import javax.persistence.Entity;
//import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name="UserKiTable")
public class User {
 
	@Id
	@GeneratedValue
	private int Id;
	
	private String Naam;
	
	@Column(unique=true, columnDefinition="varchar2(100)")
	private String Email;
	
	@Column(unique=true)
	private  String Password;
//	private Pata PataId;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNaam() {
		return Naam;
	}

	public void setNaam(String naam) {
		Naam = naam;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", Naam=" + Naam + ", Email=" + Email + ", Password=" + Password + "]";
	}
	
	
}
