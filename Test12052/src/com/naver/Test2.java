package com.naver;

public class Test2 {
	
	// ls6() 메서드는 두개의 dog 데이터를 넘겨받아
	// 안같은지 여부에 대한 결과를 반환하는 메서드입니다. 

	public boolean ls6(Dog a, Dog b) {
		boolean result = a != b;
		return result;
	}
	
	
	// ls5() 메서드는 하나의 데이터를 넘겨받아서
	// 3,4와 같은지 여부를 출력하는 메서드입니다. 

	public void ls5(double a) {
		System.out.println(a == 3.4);
	}
	
	// ls4() 메서드는 하나의 데이터를 넘겨받아서
	// 3.4f보다 작거나 같은지 여부를
	// 반환하는 메서드입니다...

	public boolean ls4(float a) {
		boolean result = a <= 3.4f;
		return result;
	}
	
	// ls3() 메서드는 두개의 long 형값을 넘겨받아
	// 첫번째 인자가 두번째 인자보다 
	// 작은지 여부를 알려주는 메서드이다.
	// 그 결과를 출력하시오.
		
	public void ls3(long e, long f) {
		boolean result =  e < f;
		System.out.println(result);
	}
	
	// ls2()메서드는 두개의 byte 형값을 넘겨받아
	// 첫번째 인자가 두번째 인자보다 
	// 크거나 같은지 여부를 알려주는 메서드이다.
	// 그 결과를 반환하시오.
		
	public boolean ls2(byte c, byte d) {
		boolean result = c >= d;
		return result;
		
	}
		
	// ls1() 메서드는 두 개의 int 형 값을 넘겨받아
	// 첫번째 인자가 두번째 인자보다 
	// 큰지 여부를 알려주는 메서드이다.
	// 그 결과를 출력하시오.
		
	public void ls1(int a, int b) {
		boolean result = a > b ;
		System.out.println(result);
	}
	
	

}
