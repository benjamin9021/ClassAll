package com.naver;

public class Test2 {
	
	/* int data = 12345;
	 * int a = 5;
	 * int b = 7;
	 * int c = 3;
	 * 
	 * int result = ((data ^ a)) ^ c
	 * 
	 * int result2 = ((result ^ c)^b)^a
	 */
	
		int data = 12345;
		int a = 5;
		int b = 7;
		int c = 3;
	
	public int me5() {
		return (((((data^a))^c)^c)^b)^a;
	}
	
	
	public void me4() {
		int a = 5 ^ 6;
		System.out.println(a);
	}
	
	public void me3() {
		int a = 5 | 6;
		System.out.println(a);
	}

	/* me2()메서드는 정수형 데이터 2개를 넘겨받아
	 * &연산을 결과를 반환하는 메서드이다.
	 */
	
	public int me2(int a, int b) {
		return a & b;
	}
	
	
	public void me1() {
		int a = 5 & 6;
		System.out.println(a);
	}
}
