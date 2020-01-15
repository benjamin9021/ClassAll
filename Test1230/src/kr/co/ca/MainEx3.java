package kr.co.ca;

public class MainEx3 {

	public static void main(String[] args) {

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("익명의 내부 클래스를 이용해서 만든 클래스");
			}
			
		}).start();
		
	}

}
