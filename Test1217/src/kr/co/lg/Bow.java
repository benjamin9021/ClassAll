package kr.co.lg;

public class Bow extends Weapon{
	
	public Bow() {}

	public Bow(int attckPower) {
		super(attckPower);
	}

	@Override
	public void img() {
		System.out.println("화살이 빛발칩니다.");
	}
	
	@Override
	public String toString() {
		return "BOW";
	}
	
}
