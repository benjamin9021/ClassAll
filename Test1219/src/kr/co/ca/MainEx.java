package kr.co.ca;

import com.naver.ChildEx1;
import com.naver.ParentEx;

public class MainEx {
	
	public static void main(String[] args) {
		
		ParentEx obj = new ChildEx1();
		obj.me1();
//		obj.only();
		
		ChildEx1 cObj = null;
		
		if (obj instanceof ChildEx1) {
			cObj = (ChildEx1) obj;
			cObj.only();
		}
		
		if (cObj != null) {
			cObj.only();
		}
		
		
	}
}
