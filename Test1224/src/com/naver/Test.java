package com.naver;

public class Test {
	
	public void me4() throws Exception{
		Thread.sleep(1000);
	}
	
	public void me3(int[] arr) {
		try {
			System.out.println(arr[4]);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(arr[arr.length-1]);
		}
	}

	
	public void me2(int num) {
		try {
			System.out.println(4 / num);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(4/1);
		}
	}
	public int me1(String msg) {
		
		int idx = -1;
		
		try {
			System.out.println(0);
			idx = msg.indexOf("a"); // 예외가 발생할 가능성이 있는 부분
			System.out.println(111);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(222);
		}
		
		return idx;
//		return msg.indexOf("a");
		
	}
	
}
