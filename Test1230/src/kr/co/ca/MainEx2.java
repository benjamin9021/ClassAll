package kr.co.ca;

public class MainEx2 {

	public static void main(String[] args) {
		
		MyRunnable mr = new MyRunnable(); // runnable 按眉
		Thread t = new Thread(mr); // thread 按眉
		t.start(); // thread 积己
		
	}
	
}
