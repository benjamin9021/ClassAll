package com.naver;

public class Test2 {
	
	
	public void test5() {
		for (int i = 100; i >= 0; i--) {
			
			// if문을 이용해서 i를 3으로 나우었을 때의 
			// 나머지를 출력해 보세요.
			System.out.println(i % 3);
								
			}
		}
	
	public void test4() {
		for (int i = 0; i < 100; i++) {
			
			// test3()의 if문을 
			// switch~case문으로 구현하시오.
			
			System.out.print(i);
			
			int key = i % 2;
			switch (key) {
			case 0:
				System.out.println("는 짝수");
				break;

			default:
				System.out.println("는 홀수");
				break;
			}
		}
	}
	
	public void test3() {
		for (int i = 0; i < 100; i++) {
			
			// sysout(i="는 짝수");
			// sysout(i="는 홀수");
			// System.out.print(i); i+를 빼도 되게끔 할 수있음.
			
			if (i % 2 == 0) {
				System.out.println(i+"는 짝수");
			} else {
				System.out.println(i+"는 홀수");
			}
					
		}
	}
	
	public void test2() {
		for (int i = 2; i < 10; i++) {
			
			//test1() 작업헀 던 if문을 
			//switch~case문으로 대체하세요.	
			
			int key = i % 2;
			
			switch (key) {
			case 0:
				System.out.println(i);
				break;
			}
		}
	}
	
	public void test1() {
		for (int i = 0; i < 100; i++) {
			//짝수만 출력하게 하세요.
			
			if ( i % 2 == 0) {
				System.out.println(i);
			}
			
		}
		
	}

	
	public void k4(int score) {
		int key = score/10;
		
		switch (key) {
		case 10:
		case 9:
			System.out.println("a");
			break;
		case 8:
			System.out.println("b");
			break;
		case 7:
			System.out.println("c");
			break;
		case 6:
			System.out.println("d");
			break;
		default:
			System.out.println("f");
		}
		
	}

	/*1,3,5,7,8,10,12 ==>sysout 31

		4,6,9,11 ===> sysout 30

		2 ==>28 */
	
	
	public void k3(int month) {
		
		switch (month) {
			
		case 2:
			System.out.println(28);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(30);
			break;
		default:
			System.out.println(31);
		}
	}
	
	
	
	public void k2(int key) {
		switch (key) {
		
		case 5:
			System.out.println("hello");
			break;
		case 1:
			System.out.println("ok");
			
		default:
			System.out.println("end");
			break;
		}
	}
	
	
	public void k1() {
		int key = 3;
		
		switch (key) {
		
		case 3:
			System.out.println(111);
			System.out.println(222);
			break;

		case 2:
			System.out.println(4444);
			System.out.println(5555);
			break;
		default:
			System.out.println("hello");
			break;
		}
	}

}
