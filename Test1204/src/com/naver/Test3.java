package com.naver;

public class Test3 {
	
	public int a;
	public static int b;

	public void me1() {
		System.out.println(123);
		a = 100;
		b = 100;
	}
	
	public static void king() {
		System.out.println(123);
		Test3 t1 = new Test3();
		
		t1.a = 100;
		
		t1.me1();
		
		
		
	}
	
	
}
