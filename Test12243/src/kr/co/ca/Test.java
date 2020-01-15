package kr.co.ca;

public class Test {
	
	// 반복문을 사용하지 않고 주어진 숫자부터 1까지의 곱을 출력하시오. 
	
	public int me4(int num) {
		int result = 1;
		if (num >= 1) {
			result = num * me4(num-1);
		}else {
			result = 1;
		}
		return result;
		
	}
	
	
	// 반복문을 사용하지 않고 주어진 숫자부터 1까지의 합을 출력하시오.
	
	public int me3(int num) {
		int result = 0;
		if (num >=1) {
			result = num + me3(num-1);
		}else {
			result = 0;
		}
		return result;
		
	}
	
	
	public void me2(int num) { // 재귀 메서드 조건을 줘 무한반복을 멈춘다.
		
		if (num >=0) {
			System.out.println("hello");
			me2(num - 1);
		}
	}
	
	public void me1() { // 재귀 메서드 자기 자신에게 다시 돌아온다.

		System.out.println("hello");
		me1();
	}

}
