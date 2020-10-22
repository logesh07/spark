package com.starBazzar.rest.model.Dao;

public class ResponseApI {

	public Integer statusCd;    
	public String statusDescription;   
	
	
	public ResponseApI(Integer statusCd, String statusDescription) {
		super();
		this.statusCd = statusCd;
		this.statusDescription = statusDescription;
	}
	
	public ResponseApI() {
		super();
	}

	public Integer getStatusCd() {
		return statusCd;
	}

	public void setStatusCd(Integer statusCd) {
		this.statusCd = statusCd;
	}
	
	public String getStatusDescription() {
		return statusDescription;
	}
	
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

}
