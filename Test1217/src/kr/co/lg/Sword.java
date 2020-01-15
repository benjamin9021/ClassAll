package kr.co.lg;

public class Sword extends Weapon{

	public Sword() {}

	public Sword(int attckPower) {
		super(attckPower);
	}

	@Override
	public void img() {
		System.out.println("SLAY by Sword");
	}
	
	@Override
	public String toString() {
		return "SWORD";
	}
	
}
