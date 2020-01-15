package kr.co.ca;

import com.naver.HerThread;
import com.naver.YourThread1;

public class MainEx2 {

	public static void main(String[] args) {
		System.out.println("main start");
		
		YourThread1 yt1 = new YourThread1();
		yt1.start();
		
		HerThread ht1 = new HerThread();
		ht1.start();
		
		HerThread ht2 = new HerThread(yt1);
		ht2.start();
		

		System.out.println("main end");
		
	}
	
}
