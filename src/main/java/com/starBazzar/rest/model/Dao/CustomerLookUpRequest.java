package com.starBazzar.rest.model.Dao;

public class CustomerLookUpRequest {

	private String mobileNumber; // customer mobile number ( same as in request)
	private Integer cardNo; // // customer card number (same as in request)
	private String name; // Customer name

	public CustomerLookUpRequest(String mobileNumber, Integer cardNo, String name) {
		
		this.mobileNumber = mobileNumber;
		this.cardNo = cardNo;
		this.name = name;
	}
	
	public CustomerLookUpRequest() {
		super();
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

	@Override
	public String toString() {
		return "CustomerLookUpRequest [mobileNumber=" + mobileNumber + ", cardNo=" + cardNo + ", name=" + name + "]";
	}

}
