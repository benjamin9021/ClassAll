package kr.co.ca;

import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// main()에서 Test클래스를 이용해서 t1객체를 만듦.
		// 생성자는 아무거나 사용하세요.
		// t1이 갖고 있는 a값을 가져와서 출력하세요.
		
		Test t1 = new Test(3, 8);
		int a = t1.getA();
		System.out.println(a);
		
		System.out.println(Test.d);

		
	}

}
