package com.lti.model;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name="PateKiTable")
public class Pata {
		
		@Id
		@GeneratedValue
		private int Id;
		
		@Column(columnDefinition="Number(6)")
		private int pin;
		
		private String SheherKaNaam;
		
		private String KamraNo;
		
		private String GaliKaNaam;
		
		@OneToOne(cascade=CascadeType.ALL)
		@JoinColumn(name = "USER_ID")// name of the foreign key
		private User UserKiId; //Unidirectional relationship between Classes

		public int getId() {
			return Id;
		}

		public void setId(int id) {
			Id = id;
		}

		public int getPin() {
			return pin;
		}

		public void setPin(int pin) {
			this.pin = pin;
		}

		public String getSheherKaNaam() {
			return SheherKaNaam;
		}

		public void setSheherKaNaam(String sheherKaNaam) {
			SheherKaNaam = sheherKaNaam;
		}

		public String getKamraNo() {
			return KamraNo;
		}

		public void setKamraNo(String kamraNo) {
			KamraNo = kamraNo;
		}

		public String getGaliKaNaam() {
			return GaliKaNaam;
		}

		public void setGaliKaNaam(String galiKaNaam) {
			GaliKaNaam = galiKaNaam;
		}

		public User getUserKiId() {
			return UserKiId;
		}

		public void setUserKiId(User userKiId) {
			UserKiId = userKiId;
		}
		
}
