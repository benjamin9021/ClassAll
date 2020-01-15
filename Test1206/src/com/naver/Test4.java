package com.naver;

public class Test4 {
	
	/* score가 90점 이상이면 '수'
	 * score가 80점 이상이면 '우'
	 * score가 70점 이상이면 '미'
	 * score가 60점 이상이면 '양'
	 * score가 60점 미만이면 '가'
	 * 출력하게 하시오.
	 */
	
	public void test(int score) {
		char answer = score >= 90? '수':
					  score >= 80? '우':
					  score >= 70? '미':
					  score >= 60? '양': '가';
		System.out.println(answer);
	}
	
	public void me4(int a, int b) {
		int c = a == b? 4 : ki(a,b);
	}
	
	
	private int ki(int a, int b) {
		return a > b ? 5 : -1;
	}


	public void me3() {
		// 변수명 = 조건식? 참값:거짓값;
		/* c의 값을 초기화 할 떄, 
		     삼항연산자(=조건연산자)를 이용하여
		     값을 정하려고 한다.
		     조건 : a > b
		     참 : 400 
		     거짓값 : -1*/
		
		int a = 10;
		int b = 20;
		
		int c = a > b? 400 : -1;
		System.out.println(c);
		
	}
	
	
	
	public void me2(int num, int n) {
		System.out.println(num << n);
	
	}
	
	public void me1(int num, int n) {
		System.out.println(num >> n);

		
	}

}
