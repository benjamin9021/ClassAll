package kr.co.ca;

import com.naver.Test3;

public class MainEx3 {

	public static void main(String[] args) {
	
		Test3 t = new Test3();
		t.me1(25);
		t.me1(0);
		
		try {
			t.me2(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("이용해주셔서 감사합니다.");
		}
		
		System.out.println("::::::::::::");
		
		
		try {
			t.me3(4);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			t.me3(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(":::::::::::::");
		int a = t.me4(3);
		a = t.me4(3);
		
	}
	
}
