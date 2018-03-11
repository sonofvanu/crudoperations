package com.niit.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserModel {
	@Id
	private String userName;
	private String userPassword, userConfirmPassword, userCity, userAddress;
	@Column(unique = true)
	private String userEmail;
	private int userAge, userContact;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserConfirmPassword() {
		return userConfirmPassword;
	}

	public void setUserConfirmPassword(String userConfirmPassword) {
		this.userConfirmPassword = userConfirmPassword;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}



	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public int getUserContact() {
		return userContact;
	}

	public void setUserContact(int userContact) {
		this.userContact = userContact;
	}

}
