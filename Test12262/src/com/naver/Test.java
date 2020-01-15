package com.naver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {

	
	
	public void show9() {
		HashSet<MemberDTO> set = new HashSet<MemberDTO>();
		
		set.add(new MemberDTO("m001", "kim", 21));
		set.add(new MemberDTO("m002", "lee", 2));
		set.add(new MemberDTO("m003", "choi", 12));
 		
		System.out.println(set);
		
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		
		set.forEach(x ->{
			list.add(x);
		});
		list.get(0);
	}
	
	public void show8() {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		Iterator<Integer> it = set.iterator();
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (it.hasNext()) {
			Integer val = it.next();
			System.out.println(val);
		}
	}
	
	public void show7() {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		System.out.println(list);
	}
	
	public void show6() {
		HashSet<MemberDTO> set = new HashSet<MemberDTO>();
		set.add(new MemberDTO("m001", "kim", 21));
		set.add(new MemberDTO("m002", "lee", 11));
		set.add(new MemberDTO("m003", "park", 38));
		set.add(new MemberDTO("m004", "choi", 42));
		set.add(new MemberDTO("m004", "kang", 55));
		
		System.out.println(set);
		set.clear();
		System.out.println(set);
		
	}

	public void show5() {
		HashSet<String> set = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("a");
		System.out.println(set);
		set.remove("a");
		System.out.println(set);
	}
	
	public int show4() {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(100);
		set.add(400);
		set.add(500);
		//set 주머니 안에 들어 있는 요소의 개수가 몇 개인지 확인 하고 출력하시오.
		int size = set.size();
		return size;
	}
	
	
	public void show3(String msg) {
		HashSet<String> set = new HashSet<String>();
		set.add("hello");
		set.add("world");
		set.add("go");
		System.out.println(set);
		
		set.add(msg);
		System.out.println(set);
	}
	
	public void show2(int i) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(2);
		boolean result = set.add(i);
		
		System.out.println(result);
		System.out.println(set);
	}
	
	// HashSet을 이용해서 set객체를 만들. String이용
	
	public void show1() {
		HashSet<String> set = new HashSet<String>();
	// Set<String> set2 = new Set<String>();
	}
	
}
