package com.naver;

public class Test {

	private int a;
	
	public void me10(int a) {
		
		this.a = a;
		System.out.println(a);
		System.out.println(aa);
		
		int b = 4;
		System.out.println(b);
		
	}
	
	public void me11() {
		System.out.println(aa);
		System.out.println(a);
	}
	
		
	//1. 파라미터의 자료형의 갯수가 다르면, 오버로딩 성립 예제
	
	public void me1() {
		System.out.println("no param");
	}

	public void me1(int a) {
		System.out.println("I don't know");
	}
	
	public void me1(int a, int b) {
		System.out.println("I don't know");
	}

	//2. 파라미터의 자료형이 다르면, 오버로딩 성립 예제
	
	public void me1(String s) {
		System.out.println(s);
	}
	
	public void me1(float a) {
		System.out.println(a);	
	}
	
	//3. 파라미터의 자료형의 배치 순서가 다르면, 오버로딩 성립 예제
	
	public void me1(int a, String b) {
		System.out.println(a);
	}
	
	public void me1(String b, int a) {
		System.out.println();
	}
	
	// ===================================================================================
	
	
	private  int aa;
		
}
