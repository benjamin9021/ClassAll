package kr.co.ca;

import java.util.ArrayList;
import java.util.Collections;

import com.naver.MemberAgeASC;
import com.naver.MemberAgeDesc;
import com.naver.MemberDTO;

public class MainEx3 {

	public static void main(String[] args) {
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		
		list.add(new MemberDTO("m003", "kim", 21));
		list.add(new MemberDTO("m001", "lee", 42));
		list.add(new MemberDTO("m004","park", 11));
		list.add(new MemberDTO("m002","kang", 33));
		
		System.out.println(list);
		Collections.sort(list,new MemberAgeASC()); // age 오름차순
		System.out.println(list);
		Collections.sort(list,new MemberAgeDesc()); // age 내림차순
		System.out.println(list);
		
		
	}
	
}
