package kr.co.ca;

public class MainEx {

	public static void main(String[] args) {
		
		System.out.println("main start");
		
		MyThread1 mt1 = new MyThread1();
		mt1.start();
		
		System.out.println("main end");
		
	}
}
