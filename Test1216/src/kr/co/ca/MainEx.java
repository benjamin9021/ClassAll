package kr.co.ca;

import com.naver.MemberDTO;

public class MainEx {

	public static void main(String[] args) {

		MemberDTO dto1 = new MemberDTO("m001", "kim", 15);
		MemberDTO dto2 = new MemberDTO("m002", "lee", 21);
		
		boolean d = dto1.equals(dto2);
		
		
		
	}

	
	
}
