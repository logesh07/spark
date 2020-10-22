package com.starBazzar.rest.model.Dao;

public class errorScenario{

	
	private Integer  Status_code;
	private String Scenario;
	private String Description;
	
	
	public errorScenario(Integer status_code, String scenario, String description) {
		Status_code = status_code;
		Scenario = scenario;
		Description = description;
	}
	
	
	public errorScenario() {
	}

	public Integer getStatus_code() {
		return Status_code;
	}
	public void setStatus_code(Integer status_code) {
		Status_code = status_code;
	}
	public String getScenario() {
		return Scenario;
	}
	public void setScenario(String scenario) {
		Scenario = scenario;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
}
