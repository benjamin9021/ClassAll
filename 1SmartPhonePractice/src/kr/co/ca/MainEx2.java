package kr.co.ca;

import java.util.ArrayList;

public class MainEx2 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add(new String("hello")); //입력하고 싶을때 넣고 싶을떄
		list.add(new String("world"));
		list.add(new String("hi"));
		list.add(new String("bye"));

		int size = list.size(); //  데이터 크기, 배열이 갖고 있는 수
		System.out.println(size);
		
		String msg = list.get(0); // list.get 특정 객체를 갖고 오고 싶을 때 사용
		String msg1 = list.get(1);
		String msg2 = list.get(2);
		String msg3 = list.get(3);
		System.out.println(msg+":"+msg1+":"+msg2+":"+msg3);
		
		String re = list.remove(2); // 배열안에 있는 특정 데이터를 지우고 싶을 때 사용
		System.out.println(re);
		
		size = list.size();    // 4였던 인덱스가 3으로 변경된다.
		System.out.println(size);
		
		list.clear();  // 배열 안 에 모든 데이터를 지우고 싶을 때
		
		size = list.size();
		System.out.println(size);
		
		boolean co = list.contains(new String("world"));  // 배열안에 들어 잇는지 아닌지 확인 하고 싶을때 만약 특정 데이터가 없다면 false 있다면 true라고 뜬다.
		System.out.println(co);
	
	}
	
}

