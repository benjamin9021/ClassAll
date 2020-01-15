package kr.co.ca;

import com.naver.HisThread;
import com.naver.YourThread1;

public class MainEx {

	public static void main(String[] args) {
		
		System.out.println("main start");
		
		YourThread1 yt1 = new YourThread1();
		yt1.start();
		
		HisThread ht1 = new HisThread();
		ht1.start();
		
		try {
			yt1.join();
			ht1.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main end");
	}
	
}
