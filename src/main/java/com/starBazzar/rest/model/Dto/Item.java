package com.starBazzar.rest.model.Dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {

	@Id
	private Integer itemno;

	private Integer EAN; // item EAN number(barcode number)
	
	private Integer itemCode; // item code which will be unique for every item
	
	private String Category; // item category
//	private Integer min; // minimum price range
//	private Integer max; // maximum price range
	
	private String longDescription; // requested item full description
	
	private String shortDescription; // requested item brief description
	
	private Integer salePrice; // item cost

	public Integer getItemno() {
		return itemno;
	}

	public void setItemno(Integer itemno) {
		this.itemno = itemno;
	}

	public Integer getEAN() {
		return EAN;
	}

	public void setEAN(Integer eAN) {
		EAN = eAN;
	}

	public Integer getItemCode() {
		return itemCode;
	}

	public void setItemCode(Integer itemCode) {
		this.itemCode = itemCode;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public Integer getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Integer salePrice) {
		this.salePrice = salePrice;
	}

}