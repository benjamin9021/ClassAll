package kr.co.ca;

import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		
		Test t1 = new Test();
		
		t1.me1(3030301);
		t1.me1(100);
		
		t1.me2(99);
		t1.me2(38);
		
		t1.me21(9);
		t1.me21(81);
		
		t1.me4("m", "mtf");
		t1.me4("m", "mm");
		t1.me4("ff", "ff");
		t1.me4("ff", "ftm");
		
		char result = t1.me6(100);
		System.out.println(result);
		
		char r = t1.me6(59);
		System.out.println(r);
		
		
		
	}
	
	
}
