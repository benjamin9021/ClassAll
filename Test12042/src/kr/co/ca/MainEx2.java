package kr.co.ca;

import com.naver.Test;
import com.naver.Test2;
import com.naver.Test3;
import com.naver.Test5;

public class MainEx2 {

	public static void main(String[] args) {
		
		//Test 클래스를 이용해서 t1 객체를 만들려고 한다.
		// 사용자 생성자를 이용하세요. (파라미터가 3개짜리..)
		
		Test t1 = new Test("m001", "park", 4);
		
		// Test2 클래스를 이용하여 객채를 t2를 생성하되
		// 생성자는 파라미터가 2개인 것을 사용하시요.
		// 파라미터의 자료형 순서는 int, Test입니다.
		
		Test2 t2 = new Test2(6,t1);
		
		// Test3 클래스를 이용하여 갹채  t3울 생성하되
		// 사용자 생성자를 이용하여 만드시오.
		// 객체 t31 주어진 데이터는 "kim", 'c' 뿐입니다.		
		
		Test3 t3 = new Test3("lee", 3, true, 'd');
		 
		Test3 t31 = new Test3("kim", 0, false,'c');
		
		// Test5 클래스를 이용하여 객채 t5를 생성하되
		// 사용자 생성자를 이용하여 만드시오.
		
		int[] arr = new int[4];
		
		Test5 t5 = new Test5(new StringBuffer("hello"), arr, false);
		
		
		
	}

}
