package kr.co.ca;

import com.naver.Test;

public class MainEx {

	public static void main(String[] args) throws Exception {
	
		Test t = new Test();
//		int num = t.me1("hello");
		int num = t.me1(null);
		System.out.println(num);
		System.out.println(":::::::::::");
		t.me2(3);
		t.me2(0);
		System.out.println(":::::::::::");

		int[] arr = {1,4,5};
		t.me3(arr);
		
		System.out.println("::::::::::::");
		
		t.me4();
		
		
	}
	
}
