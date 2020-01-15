package com.naver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test {
	
	public void me8() {
		HashMap<String,ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		ArrayList<String> objinfo = new ArrayList<String>();
		objinfo.add("컴포넌트");
		objinfo.add("모듈");
		objinfo.add("인쇄회로기판");
		objinfo.add("어플리케이션");
		objinfo.add("제품검색");
		map.put("제품정보", objinfo);
		System.out.println(map);
	}
		
	
	public void me7() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 97);
		map.put("b", 98);
		map.put("c", 99);
		map.put("d", 100);
		map.put("e", 101);
		map.put("f", 102);
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key+":"+map.get(key));
		} 
//		아래 코드는 위의 코드를 간단하게 쓴 것.
//		Iterator<String> keys = map.keySet().iterator();
//		while (keys.hasNext()) {
//			String key = keys.next();
//			System.out.println(key+":"+map.get(key));
//		} 
	}
	
	public void me6() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.put("e", 5);
		map.put("f", 6);
		
		int a = map.get("a");
		System.out.println(a);
		System.out.println(map);  // 중괄호로 넣기 위해서
		map.remove("a");  // remove는 하나의 데이터를 삭제
		System.out.println(map);
		map.clear(); // 모든 데이터를 삭제
		System.out.println(map);
	}
	
	public void me5() {  // 암기~! 이 형태로 많이 쓰인다. 
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		ArrayList<String> tvlist = new ArrayList<String>();
		tvlist.add("qled");
		tvlist.add("oled");
		tvlist.add("led");
		ArrayList<String> countrylist = new ArrayList<String>();
		countrylist.add("korea");
		countrylist.add("usa");
		countrylist.add("china");
		
		map.put("tv", tvlist);
		map.put("country", countrylist);
		
		System.out.println(map);
	}
	
	public void me4() {
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("tv", "qled");
		map.put("tv", "oled");
		map.put("tv", "led");
		
		map.put("country", "korea");
		map.put("country", "usa");
		map.put("country", "china");  
		
		String tv = map.get("tv");  // 제일 마지막 데이터인 led를 가져옵니다..
		String country = map.get("country");  // 제일 마지막 데이터를 가져옵니다..
		
		System.out.println(tv);
		System.out.println(country);
	}
	
	public void me3() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("grade1", 1);
		map.put("grade1", 2);
		map.put("grade1", 3);
		map.put("grade1", 4);
		
		map.put("grade2", 5);
		map.put("grade2", 6);
		map.put("grade2", 7);
		map.put("grade2", 8);
		map.put("grade2", 9);
		
		int size = map.size();
		System.out.println(size);
		System.out.println(map);   // key가 똑같은게 있으면 대입이고, 새로운 것이 있으면 입력.
	}
	
	public void me2() {
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("car", "bmw"); // put 데이터를 넣어줄 때 사용된다
		map.put("car", "sm5");
		map.put("car", "sonata");
		map.put("tv", "Qled");
		map.put("tv", "oled");
		map.put("phone", "gal");
		map.put("phone", "g");
	}

	public void me1() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
	}
}
