package com.naver;

public class HerThread extends Thread {
	
	private YourThread1 yt1;
	
	public HerThread() {}

	public HerThread(YourThread1 yt1) {
		this.yt1 = yt1;
	}

	@Override
	public void run() {
		try {
			yt1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(333);
		
	}
	
}
