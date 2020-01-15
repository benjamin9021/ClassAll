package com.naver;

import java.util.Scanner;

public class Test4 {
	

	public void me2() throws MyException {
		
		String msg = "씨발";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("댓글을입력하세요.");
		String str = sc.nextLine();
		boolean isTrue = str.contains(msg);
		
		if (isTrue) {
			sc.close();
			throw new MyException("옥설금지");
		}else {
			System.out.println(str);
			sc.close();
		}
		
	}
	
	public void me1() {
		
		String msg = "개새끼";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("댓글을 입력하세요.");
		String str = sc.nextLine();
		boolean isTrue = str.contains(msg);
		if (isTrue) {
			System.out.println("욕하지 마세요.");
			sc.close();
		}else {
			System.out.println(str);
			sc.close();
		}
		
	}

}
