package com.naver;

public class Test {
	
	
	
	
	public double me19(float c, float d) {
		double a = (double)c+d;
		System.out.println(c+d);
		return a;
		
	}
	
	public long me18(String a, int b, int c) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		return (long)b+c;
		
	}
	
	
	public long me17(int a, int b) {
		long c = (long)a-b;
		System.out.println(a-b);
		return c;
	}
	
	
	public String me16(int a) {
		System.out.println(a);
		return new String("Hello");
		
	}
	
	
	
	private void me15(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	
	public String aa() {
		return new String("a5a");
	}
	
	
	public long me10(int a) {
		long b = (long)a * 5;
		return b;
	}
	
	public String me9(String s) {
		System.out.println("안녕하세요,1,2,3,3.2true");
		return s;
	}
	
	public void me7(String a, boolean b, double c){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	private String me8() {
		System.out.println("Hi");
		return new String("Hello");
	}
	
	public String me9 (int a) {
		System.out.println(a);
		return new String("Hello");
	}
	
	private void me5(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	protected boolean me4(int a) {
		System.out.println(a*10);
		return true;
	}
	
	public int me3(int a, int b) {
		System.out.println(a+b);
		return a+b;	
		
	}
	
	public String me2() {
		System.out.println("hello");
		return new String("hello world");
		
	}
		
	public Test() {
		System.out.println("나는 몇번쨰 로 실행될까요?");
		
	}
	
	public String me1() {
		System.out.println("hello");
		return new String("hello world");

	}
	

}
