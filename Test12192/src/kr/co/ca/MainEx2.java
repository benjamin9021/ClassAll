package kr.co.ca;

import java.util.ArrayList;

public class MainEx2 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		
		list.add(new String("hello")); //입력하고 싶을 때 add
		
		int size = list.size(); // 글자 수 데이터 크기
		System.out.println(size);
		
		String msg = list.get(0); // 특정객체를 가져오는 거 
		System.out.println(msg);
		
		list.remove(0); // 특정객체를 지우는 거 삭제하는거
		list.clear(); // 전부다 삭제

//		list.set(index, element) 수정 = replace

		list.add(new String("hello"));
		list.add(new String("world"));
		list.add(new String("bye"));
		
		size = list.size();
		System.out.println(size);
		
		String msg1 = list.get(1);
		String msg2 = list.get(2);
		System.out.println(msg1 + ":" + msg2);
		
		list.remove(2);
		list.clear();
		
		boolean co = list.contains(new String("world"));
		System.out.println(co);
		
		ArrayList<Apple> list2 = new ArrayList<Apple>();
		
		list2.add(new Apple()); // 그냥 객체만 넣어줘도 되고
		
		Apple apple1 = new Apple();
		
		list2.add(apple1); // 변수를 선언해서 변수명을 넣어줘도 된다
		
		
		
	}

}
