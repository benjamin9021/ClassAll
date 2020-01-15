package kr.co.ca;

public class MyThread3 extends Thread {

	@Override
	public void run() {
		System.out.println("Thread 작업 전.");
		while (true) {
			System.out.println(getName());
			System.out.println("Thread 작업 중..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
