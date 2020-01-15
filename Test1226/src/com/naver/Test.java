package com.naver;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public void me11() {
		ArrayList<Character> list = new ArrayList<Character>();
		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');
		list.add('e');
		list.add('f');
		
		System.out.println(list);
		list.clear();
		System.out.println(list);
		
	}
	
	public void me10() {
		ArrayList<Character> list = new ArrayList<Character>();
		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');
		list.add('e');
		list.add('f');
		
		System.out.println(list);
		for (int i = list.size()-1; i >= 0; i++) {
			if (i == 0 || i == 2 ) {
				list.remove(i);
			}
		}
		System.out.println(list);
	}	
	
	
	
	public void me9(int idx) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(500);
		list.add(600);
		
		System.out.println(list);
		list.remove(idx);
		System.out.println(list);
		
		
	}
	
	public void me8(int idx) {
		ArrayList<Character> list = new ArrayList<Character>();
		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');
		list.add('e');
		list.add('f');
		
		System.out.println(list);
		list.remove(idx);
		System.out.println(list);
		
		
	}
	
	public int me7(MemberDTO dto) {
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		list.add(new MemberDTO("m001", "kim", 15));
		list.add(new MemberDTO("m002", "lee", 21));
		list.add(new MemberDTO("m003", "park", 30));
		list.add(new MemberDTO("m004", "choi", 40));
		int idx = list.indexOf(dto);
		return idx;
		
	}

	
	public void me6(int idx, String newMsg) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("hi");
		list.add("ben");
		list.add("!!!");
		System.out.println(list);
		list.set(idx, newMsg);
		System.out.println(list);

	}
	
//	1. list 객체를 만들고. MemberDTO
//	2. me4()에 있는 add() 호출부문 복/붙
//	3. list 안에 있는 회원 정보를 획득해서 id:name:age 형태롤 출력
//	단, 반복문 사용 시 -- 연산자를 이용하세요.

	public void me5() {
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		list.add(new MemberDTO("m001", "kim", 15));
		list.add(new MemberDTO("m002", "kim", 21));
		list.add(new MemberDTO("m003", "kim", 30));
		list.add(new MemberDTO("m004", "kim", 40));
		list.add(new MemberDTO("m005", "kim", 50));
		list.add(new MemberDTO("m006", "kim", 60));
		list.add(new MemberDTO("m007", "kim", 70));
		list.add(new MemberDTO("m008", "kim", 80));
		
		for (int i = list.size()-1 ; i >= 0; i--) {
			MemberDTO dto = list.get(i);
			String id = dto.getId();
			String name = dto.getName();
			int age = dto.getAge();
			
			System.out.println(id+":"+name+":"+age);
		}
		
		
	}
	
	public void me4() {
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		
		list.add(new MemberDTO("m001", "kim", 15));
		list.add(new MemberDTO("m002", "kim", 21));
		list.add(new MemberDTO("m003", "kim", 30));
		list.add(new MemberDTO("m004", "kim", 40));
		list.add(new MemberDTO("m005", "kim", 50));
		list.add(new MemberDTO("m006", "kim", 60));
		list.add(new MemberDTO("m007", "kim", 70));
		list.add(new MemberDTO("m008", "kim", 80));
		
		MemberDTO dto0 = list.get(0);
		String id0 = dto0.getId();
		String name0 = dto0.getName();
		int age0 = dto0.getAge();
		
		for (int i = 0; i < list.size(); i++) {
			MemberDTO dto = list.get(i);
			String id = dto.getId();
			String name = dto.getName();
			int age = dto.getAge();
			
			System.out.println(id+":"+name+":"+age);
		}
	
	
	}

	
	public void me3() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("hi");
		list.add("bye");
		list.add("ben");
		list.add("min");
		list.add("Kim");
		list.add("30");
		list.add("chef");
		list.add("developer");
	}
	
	
//	list객체가 있습니다. 다형성으로 이용해서 
//	list객체를 만드시요.
//	단, 객체 생성할 때, ArrayList를 활용하고
//	list 안에는 StringBuffer만 저장할 수 있게 하시오.
	
	public void me2() {
		List<StringBuffer> list = new ArrayList<StringBuffer>();
	}
	
//	ArrayList list 상자가 있습니다.
//	이 상자에는 정수(제네릭타입)만을 담을 수 있습니다.
//	list 상자를 만들고
//	이를 반환 하세요.
	
	public ArrayList<Integer> me1() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		return list;
	}
	
}
