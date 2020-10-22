package com.starBazzar.rest.model.Dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer CustomerId;
	private String mobileNumber; // customer mobile number ( same as in request)
	private Integer cardNo; // // customer card number (same as in request)
	private String name; // Customer name
	private Integer point; // Points that customer has(by default customer should have 1000 points)
	private String address;// 1/100,Anna nagar,Near Anna Restaurent,Chennai - 6000001 “ // customer address
	private String email;// ":”abc@gmail.com”

	public Customers() {

	}

	public Integer getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(Integer customerId) {
		CustomerId = customerId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Integer getCardNo() {
		return cardNo;
	}

	public void setCardNo(Integer cardNo) {
		this.cardNo = cardNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customers [CustomerId=" + CustomerId + ", mobileNumber=" + mobileNumber + ", cardNo=" + cardNo
				+ ", name=" + name + ", point=" + point + ", address=" + address + ", email=" + email + "]";
	}

}
