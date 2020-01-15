package com.naver;

public class Test {
	
	// 3의 배수를 실행시키지않는다
	// 그외 값만 진행 feat.continue
	
	public void me111(int a) {
		int skip =3;
		
		for (int i = 0 ; i < 10 ; i++) {
			if (i % 3 == 0 ) {
				continue;
			}
			System.out.println(i);
		}
	}
	
	public void me6() {
		for (int i = 0; i <5; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public void sossu(int start, int end) {
		// sossu()메서드는 특정 범위를 입력받아서
		// 그 안에 있는 수들에 대해 소수 여부를
		// 판정하는 기능을 갖고 있다.
		// 반드시 me5()를 활용하세요.
		
		for (int num = start; num < end ; num++) {
			me5(num);
			
		}
			
		
	}
	
	public void me5(int num) {
		boolean isSossu = true;
		
		for(int i = 2; i < num ; i++ ) {
			if (num % 1 == 0 ) {
				isSossu = false;
				break;
				
			}
		}
		System.out.print(num);
		if (isSossu == true) {
			System.out.println("는 소수입니다.");
		}else {
			System.out.println("는 소수가 아닙니다.");
		}
			
	}
	
	public void me5() {
	      int num = 11;

	      boolean isSossu = true;

	      for (int i = 2; i < num; i++)

	         if (num % i == 0) {
	            isSossu = false;
	            break;
	         }

	      System.out.print(num);

	      if (isSossu) {
	         System.out.println("은 소수입니다.");
	      } else {
	         System.out.println("은 소수아닙니다.");

	      }
	   }
	
	// me42() 구구단을 모두 찍어내는 메서드입니다.
	// me41()를 이용하여 구구단을 모두 출력하시오.
	
	public void me42() {
		for (int dan = 2; dan < 10; dan++) {
			me41(dan);
			System.out.println(dan);
		}
	}
		
	// me41() 구구단 중에서
	// 특정단 정보를 입력받아
	// 해당 단을 출력하는 메서드입니다.
	
	public void me41(int dan) {
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + "x" + i +"="+(dan*i));
		}
	}
	
	// 구구단 5단출력 me4
		
	public void me4() {
		int dan = 5;
		for (int i = 1; i <10; i++) {
			System.out.println(dan + "x" + i +"="+(dan*i));
		}
	}
	
	// me3()메서드는 특정 범위의 숫자 중에서
	// 짝수만을 출력하는 메서드입니다.
	// 특정 범위의 숫자에 대한 정보는
	// 메서드 호출 떄 입력됩니다.
	
	public void me3(int start, int end) {
		for (int i = start; i < end; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	
	// me21()메서드는 a부터 z까지 출력하는 메서드이다.
	
	public void me21() {
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.println(i);
		}
	}
	
	
	
	// me2()메서드는 특정 수에서 100까지의 숫자 중에서
	// 4의 배수를 출력하슨 메서드이다.
	
	public void me2(int start) {
		for (int i = start ; i < 100; i++) {
			if(i % 4 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public void me0() {
		for (int i = 0; i < 5; i++) {
			System.out.println("hello");
		}
	}
	
	public void me12() {
		for (int i = 100; i >= 0; i--) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
	
	
	public void me11() {
		// 0부터 100까지의 숫자 중
		// 3의 배수만 출력하세요.
		for (int i = 0; i < 101; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
	
	
	public void me1() {
		for(int i=0; i<100; i++) {
			System.out.println(i);
			System.out.println("hello world");
		}
	}
	
}
