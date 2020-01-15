package com.naver;

public class EmployeeDTO {
	
	private String eId;
	private String eName;
	private int eAge;
		
	public EmployeeDTO() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	public String getEId() {
		return eId;
	}
	
	public void setEId(String eId) {
		this.eId = eId; 
		
	}
	
	public String getEName() {
		return eName;
	}
	
	public void setEName(String eName) {
		this.eName = eName;
	}
	
	public int getEAge() {
		return eAge;
	}
	
	public void setEAge(int eAge) {
		this.eAge = eAge;
	}
	
}
