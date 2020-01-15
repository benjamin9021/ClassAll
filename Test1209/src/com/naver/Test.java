package com.naver;


public class Test {

	// score가 >=90 a >=80 b >=70 c >= 60 d < 60 f 반환
	
	public char me6(int score) {
		char c = 0;
		if (score >= 90) {
			c = 'a';
		} else if (score >= 80){
			c = 'b';
		} else if (score >= 70) {
			c = 'c';
		} else if (score >= 60) {
			c = 'd';
		} else {
			c = 'f';
		}
		return c;
	}
	
	
	/* me51()메서드는
	 kor(국어점수)와  eng(영어점수)를
	 입력받아서
	 두 점수가 평균 60점일 떄는
	 sysout("합격")
	 그렇지 않은면
	 sysout("불합격")을 출력하는 메서드*/
	
	// ## anwser
	
	// public void me51(int kor, int eng) {
	// 		double avg = (kor + eng) / 2;
	// 		if( avg >= 60 {
	// 			sysout("pass");
	// 		}else{
	// 			sysout("fail")'
	// 		}
	// }
	
	// 아랫 거는 축소 된 거지만, 만약 다른 것을 더 기입하였을 경우, 위의 코드가 더 좋음.
	// 아랫 것을 더 추가하고 싶을 떄,  double avg를 써서 하는게 간편..
	// 결론 적으로 코드를 간편하게 쓸 수 있는 것은 위의 코드....
	// 또는, int값이 넘어갔을 경우를 대비해서..double..
	
	public void me51(int kor, int eng) {
		if (((kor + eng) /2) >= 60) {
			System.out.println("합격");
	} else { 
		System.out.println("불합격");
	}
	}
	
	
	/* me5()메서드는
	 kor(국어점수)와  eng(영어점수)를
	 입력받아서
	 두 점수가 각각 60점 이상일 떄는
	 sysout("합격")
	 둘 중에 하나라도 60점 미만이면,
	 sysout("불합격")을 출력하는 메서드*/
	
	public void me5(int kor, int eng) {
		
		if (kor >= 60 && eng >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
	}
		
	
	// if 문안에 if문 넣는 예제
	// if 문안에는 if문이나 다중 if문이나 if else문을 다 넣을 수 있다.
	
	public void me4(String gen1, 
					String gen2) {
			
		// gen1 : 주민등록상 성,
		// gen2 : 실제 몸 상태에 따른 성
		// mm 
		// ff
		// mtf
		// ftm
		
		if (gen1.equals("m")) {
			if(gen2.equals("mm")) {
				System.out.println("mm");
			}else {
				System.out.println("mtf");
			}
		} else {
			if( gen2.equals("ff")) {
			System.out.println("ff");
			} else {
			System.out.println("ftm");
		}
	}
		
		
	}
	
	
	// ===========================================================
	// 다중if문
	
	public void me4(int a) {
		
		// a를 4로 나우었을 떄의
		// 나머지를 생각..
		// 0이면, sysout("hello")
		// 1이면, sysout("world")
		// 2이면, sysout("good")
		// 그렇지않으면 sysout("end"),
		//			sysout("bye")
		
		if ( a % 4 == 0 ) {
			System.out.println("hello");
		} else if ( a % 4 == 1) {
			System.out.println("world");
		} else if (a % 4 == 2) {
			System.out.println("good");
		} else {
			System.out.println("end");
			System.out.println("bye");
		}
		
	}

	
	// ==========================================================
	// if(){ } else {} 문
	
	public void me31(int score) {
	
		// score가 60 이상이면, sysout("pass")
		// 그렇지 않으면 sysout ("fail")
	
		if ( score >= 60 ) {
			System.out.println(score+"pass");
		}else {
			System.out.println(score+"fail");
		}
		
	}
	
	public void me3(int a) {
		
		// a가 짝수면, sysout("짝수")
		// 그렇지 않으면, sysout("홀수")
		
		if ( a % 2 == 0) {
			System.out.println(a+"짝수");
		}else {
			System.out.println(a+"홀수");
		}
	}
	
	
	// ======================================================
	// 단순 if문
	
	public void me21(int a) {

		// a를 4로 나누었을 떄,
		// 나머지가 1이면
		// sysout("a는 4로 나누면 나머지가 1입니다.")
		
		if( a % 4 == 1 ) {
			
			System.out.println("a는 4로 나누면 나머지가 1입니다.");
		
		}

	}
	
	
	public void me2(int a) {
		
		// a가 3의 배수이면,
		// sysout( a + "는 3의 배수입니다.")
		// a가 3의 배수가 아니면,
		// sysout( a + "는 3의 배수가 아닙니다.")
		
		if( a % 3 == 0 ) {
			
			System.out.println(a + "는s 3의 배수입니다.");
		}
		
		if( a % 3 != 0 ) {

			System.out.println(a + "는 3의 배수가 아닙니다.");
		}
	
	}
	
	
	public void me1(int a) {
		
		if( a % 2 == 0 ) {
		
			System.out.println(a + "는 짝수");
	
		}
		
		if( a % 2 != 0 ) {
		
			System.out.println(a + "는 홀수");
		
		}
		
	}
	
}
