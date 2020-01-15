package com.naver;

public class Test {

	public void me6() {
		int i = 0;
		while (i<100) {

			if(i % 3 == 0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
	
	public void me5() {
		int i = 100;
		while (i<50) {
			System.out.println(111);
			i++;
		}
		do {
			System.out.println(222);
			i++;
		} while (i<50);
		
	}
	
	
	public void sossu(int start, int end, int count) {
		int i = start;
		while(i < end + 1 ) {
			int find = isSossu(i);
			count = count - find;
			if (count == 0) {
				break;
			}
			i++;
		}
		
	}
	
	public void sossu(int start, int end) {
		int i = start;
		while(i < end + 1 ) {
			isSossu(i);
			i++;
		}
		
	}
	
	
	public int isSossu(int num) {
		int i = 2;
		boolean issossu = true;
		while (i < num ) {
			if(num % i == 0) {
				issossu = false;
				break;
			}
			i++;
		}
		if(issossu) {
			System.out.println(num +"은 소수");
			return 1;
		}else {
			System.out.println(num + "은 소수아님");
			return 0;
		}
		
	}
	
	
	public void gugudan3() {
		int i = 1;
		while (i < 10) {
				gugudan31(i);
				System.out.println();
				i++;
		}
	
	}
	
	private void gugudan31(int i) {
		int dan = 2;
		while (dan < 10) {
				System.out.print(dan + "x" + i + '=' + dan*i);
				System.out.print("\t");
				dan ++;
		}	
	}
	
		
	public void gugudan2() {
		int dan = 2;
		while (dan<10) {
			int i = 1;
			while (i < 10) {
				System.out.print(dan);
				System.out.print("x");
				System.out.print(i);
				System.out.print('=');
				System.out.println(dan*i);
				i++;
			}
			System.out.println();
			dan++;
		}
		
	}
	
	
	public void gugudan() {
		int dan = 2;
		while (dan < 10) {
			me4(dan);
			dan++;
		}
	}
	
	public void me4(int dan) {
		int i = 1;
		while (i < 10) {
			System.out.print(dan);
			System.out.print("x");
			System.out.print(i);
			System.out.print('=');
			System.out.println(dan*i);
			i++;
		}
				
	}
	
	public void me31(int start, int end) {
		
		if (start % 2 != 0 ) {
			start = start + 1;
		}
		while (start < end +1) {
			System.out.println(start);
			start += 2;
		}
	}
	
	public void me3(int start, int end) {
		/* start부터 end까지의 숫자 중에서
		 * 짝수만 출력하세요.
		 */
		while (start <  end + 1 ) {
			if (start % 2 == 0) {
				System.out.println(start );
			};
			start ++;
		}
		
	}
	
	public void me2() {
		/* 0~100까지의 숫자 중 4의 배수를 출력하시요 */
		int i = 0;
		while (i < 101) {
			System.out.println(i);
			i = i + 4;
		}
		
		
	}
	
	
	public void me13() {
		for (int i = 0; i < 101; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public void me12() {
		//o~100까지의 숫자중에서
		//3의 배수만 출력하시오.
		int i = 0;
		while (i < 101) {
			if (i % 3 == 0) {
			System.out.println(i);
			}
			i++;
		}
		
		
	}

	public void me11() {
		int i = 0;
		while(i < 101) {
			System.out.println(i);
			i++;
		}					
	}
	
	public void me1() {
		for(int i = 0; i <101; i++) {
			System.out.println(i);
		}
	}
	
	
}
