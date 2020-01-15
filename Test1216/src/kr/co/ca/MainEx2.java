package kr.co.ca;

import com.naver.MemberDTO;
import com.naver.Toy;

public class MainEx2 {

	public static void main(String[] args) {

		// MemberDTO, 클래스를 이용하여 객체를 만듦.
		// 다형성을 이용해서 dto1 객체를 만들어보세요.
		
		Object dto1 = new MemberDTO("m003","park",31);
		
		Object dto2 = new MemberDTO("m004","choi",8);
		
		Object dto3 = new Toy();
		
		
		
	}

}
