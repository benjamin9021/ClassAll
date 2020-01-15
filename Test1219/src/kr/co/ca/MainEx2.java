package kr.co.ca;

import com.naver.ChildEx1;
import com.naver.ParentEx;
import com.naver.SubEx1;

public class MainEx2 {

	public static void main(String[] args) {
		
		ParentEx obj1 = new ChildEx1();
		ParentEx obj2 = new SubEx1();
		
		ChildEx1 cObj = null;
		
//		if (obj2 instanceof ChildEx1) { 불가능 SubEx1이기떄문에
//			cObj = (ChildEx1)obj2;   -형제관계도 실행불가능
//			cObj.only();             -
//		}
		
		
	}
}
