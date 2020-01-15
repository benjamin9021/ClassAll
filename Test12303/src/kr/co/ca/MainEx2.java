package kr.co.ca;

import com.naver.MyThread;
import com.naver.Sum;

public class MainEx2 {

	public static void main(String[] args) {
		
		Sum sum = new Sum(0);
		
		MyThread mt1 = new MyThread(sum, 0, 10000);
		mt1.start();
		
		try {
			mt1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(sum.num);
	}
}
