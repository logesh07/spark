package com.starBazzar.rest.model.Dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cashier {

	@Id
	private Integer cashierId;
	
	private Integer shiftNo;
	
	private String cashierName;


	
	public Integer getCashierId() {
		return cashierId;
	}

	public void setCashierId(Integer cashierId) {
		this.cashierId = cashierId;
	}

	public Integer getShiftNo() {
		return shiftNo;
	}

	public void setShiftNo(Integer shiftNo) {
		this.shiftNo = shiftNo;
	}

	public String getCashierName() {
		return cashierName;
	}

	public void setCashierName(String cashierName) {
		this.cashierName = cashierName;
	}
	
	
	
}
