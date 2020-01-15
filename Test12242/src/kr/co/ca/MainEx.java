package kr.co.ca;

public class MainEx {

	public static void main(String[] args) {
		
		Test<String> t= new Test<String>();
		
		String name = t.getName();
		
		Test2<String, String> t2 = new Test2<String, String>();
		
		t2.getA();
		
		
	}
	
}
