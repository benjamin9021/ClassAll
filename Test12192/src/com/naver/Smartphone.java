package com.naver;

public class Smartphone implements Phone, Camera, Cam, PC, Game { // 다중상속에 대한 모습

	@Override
	public void call(String number) {
		
		System.out.println(number+"로 전화를 겁니다.");
		
	}

	
	
	
	
}
