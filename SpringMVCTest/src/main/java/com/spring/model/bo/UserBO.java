package com.spring.model.bo;

import javax.persistence.Id;

public class UserBO {

	private Integer userId;

	private String userFirstName;
	

	private String userLastName;
	private String emailAddress;
	private Integer phoneNumber;
	

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return userId+" "+userFirstName+" "+userLastName+""+emailAddress+""+phoneNumber;
	}

	
}
