package com.naver;

public class Test4 {

	public void me1() {
		new Command() {
			
			@Override
			public void execute() {
				System.out.println("진짜 익명의 내부 클래스");
			}
		}.execute();
	}
	
	public Command com = new Command() {
		
		@Override
		public void execute() {
		System.out.println("overriding");	
		}		
	};
	
}
