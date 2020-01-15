package kr.co.ca;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.naver.Car;

public class MainEx2 {
	
	public static void main(String[] args) {
		

		InputStream in =  null;
		try {
			in = new FileInputStream("C:" + File.separator + "hello222.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				if (in != null) {
					in.close();
				} 
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		Thread t = new Thread();
		t.start();
		
		try {
			t.join();
		} catch (InterruptedException e1) {
			System.out.println(1111);
		}
		
		
		
		Car sm5 = new Car();
		
		try {
			sm5.run();
		} catch (Exception e) {
			System.out.println("정비업체 요청");
		}
		
	}

}
