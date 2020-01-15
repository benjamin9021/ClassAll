package kr.co.lg;

import kr.co.daum.Monster;

public class Weapon {

	private int attckPower;
	
	public void attack(Monster mon) {
		img();
		int bHp = mon.getHp();
		int aHp = bHp - attckPower;
		
		mon.setHp(aHp);
		
	}
	
	public void img() {
		System.out.println("Overriding to each Child Weapon Class");
	}
	
	public Weapon() {}

	public Weapon(int attckPower) {
		this.attckPower = attckPower;
	}

	public int getAttckPower() {
		return attckPower;
	}

	public void setAttckPower(int attckPower) {
		this.attckPower = attckPower;
	}
	
}
