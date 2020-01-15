package kr.co.ca;

import com.naver.Test1;
import com.naver.Test2;
import com.naver.Test3;
import com.naver.Test4;

public class MainEx {
	 
	public static void main(String[] args) {
	
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					System.out.print(3+" "+"X"+" "+i+" "+"="+" "+3*i+"\t");
				}
				System.out.println();
			}
		}).run();

		Test4 obj4 = new Test4();
		obj4.com.execute();
		
		Test2.SIC obj2 = new Test2.SIC();
		obj2.ok();
		
		Test1.MIC obj = new Test1().new MIC();
		obj.ko();
		
	}
	
}
