package com.naver;

public class SuperEx {

	private int a;
	
	public void me1() {
		System.out.println("부모클래스 내용 1");
	}
	
	public void me2() {
		System.out.println("부모클래스 내용2");
	}

	@Override
	public String toString() {
		return "hello";
	}


	
	
}
