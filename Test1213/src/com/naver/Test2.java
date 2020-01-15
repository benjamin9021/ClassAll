package com.naver;

import java.util.StringTokenizer;

public class Test2 {
	
	public void me11() {
		
		String str1 = "    id#pw#point#grade##age   ";
		String str2 = "    id#pw#point#grade##age   ";
		
		str1 = str1.trim();
		str2 = str2.trim();
		
		String[] arr1 = str1.split("#");
		//String id = arr1[0];
		for (int i = 0; i < arr1.length; i++) {
			String val = arr1[i];
			System.out.println(val);
		}
		
		System.out.println(":::::::::::::::::");
		
		StringTokenizer st = new StringTokenizer(str2,"#");
		System.out.println(st.countTokens());
		String[] arr= new String[st.countTokens()];
		
		int idx = 0;
		
		while (st.hasMoreElements()) {
			String temp = st.nextToken();
			arr[idx++] = temp;
			// idx++;
			System.out.println(temp);
		}
		
	}
	
	public void me10() {
		
		String case11 = "abcdefg";
		String msg = case11.toUpperCase();
		case11 = msg.toLowerCase();
		
	}
	
	
	public void me9() {
		
		String str = "who are you? I'm a doctor.";
		boolean is = str.contains("doctor");
		
	}

	
	public void me8() {
		
		String fileName = "aaaaa.png";
		boolean b = fileName.endsWith("png");
		System.out.println(b);
		
	}
	
	
	public void me72() {
	
		String str = "1234456780123456678";
		int startIdx = str.indexOf('4',4);
		int flastIdx = str.lastIndexOf('6');
		int lastIdx = str.lastIndexOf('6', flastIdx - 1);
		String msg = str.substring(startIdx, lastIdx);
		
	}
	
	
	public void me71() {
		
		String str = "1234456780123456678";
		int startIdx = str.indexOf('4');
		int endIdx = str.lastIndexOf('6');
		String msg = str.substring(startIdx, endIdx);
	}
	
	public void me7() {
		
		String str = "123445678978956563841";
		int idx = str.indexOf("4");
		String msg = str.substring(idx);
		System.out.println(msg);
		
	}
	
	
	public void me6() {

		String str = "         hello world           ";
		// trim() 메서드를 이용하면 앞뒤 뛰어쓰기 지워짐.
		// 단, 문자 중간 뛰어쓰기는 안지워짐.

		str = str.trim();
		System.out.println(str);
	}

	public void me5() {
		// .length() 매서드는 문자 숫자 알고 싶을떄...
		String str = "good mornig";

		int size = str.length();
		System.out.println(size);
	}

//	public void me41() {
//		
//		String str1 = "1";
//		String str2 = "2";
////		str1 + str2 = "12"
//	
//	    Interger.valueOf(), Interger.parseInt()는 int값을 계산하고(더하고) 싶을떄 쓴다.
//	
//		int i1 = Integer.valueOf(str1);
//		int i2 = Integer.parseInt(str2);
//		
////		i1 + i2 = 3;
//		
////		Character.valueOf(arg0);  못씀
////		Character.parseChar();    못씀
//		
//		String str3 = "a";
////		char c = str3.charAt(0);   // 이걸로 씀
//		
//	}

	public void me4() {
		// charAt()메서드는 문자를 더하거나 집어넣고 싶을 떄..
		String msg = "a";
		
		char c = msg.charAt(0);
		System.out.println(c);

	}

	public void me3() {
		// String buffer문자열로 string의 값을 더하고 싶을때, append()메서드를 이용한다. 
		StringBuffer sb = new StringBuffer("hello");
		sb.append(" world");
		sb.append("!!!");

		String str = sb.toString();
		System.out.println(str);

	}

	public void me2() { // 동등성 비교

		String str1 = new String("hello");
		String str2 = "hello";
		String str3 = "hello";
		String str4 = new String("hello");
		String str5 = str4;

		boolean trueOrfFalse = str1.equals(str2); // string 클래스에 equals메서드를 이용시 같다.
		System.out.println(trueOrfFalse);
	}

	public void me1() {

		String str1 = new String("hello");
		String str2 = "hello";
		String str3 = "hello";
		String str4 = new String("hello");
		String str5 = str4;

		System.out.println(str1 == str2); // false가 출력 명시적
		System.out.println(str2 == str3); // true가 출력 암시적
		System.out.println(str1 == str4); // false가 출력 new String이기에 새로운 객체가 생성됬기떄문
		System.out.println(str4 == str5); // true가 출력 객체가 같아서

	}

}
