package kr.co.ca;

public class MyThread2 extends Thread {

	public MyThread2() {
		// TODO Auto-generated constructor stub
	}
	
	public MyThread2(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		String name = getName();
		System.out.println(name);
	}

}
