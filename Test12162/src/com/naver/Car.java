package com.naver;

public class Car {

	private int company;

	
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(int company) {
		super();
		this.company = company;
	}

	public int getCompany() {
		return company;
	}

	public void setCompany(int company) {
		this.company = company;
	}


	public void stop() {
		System.out.println("차가 정지합니다.");
	}
	
	
}
