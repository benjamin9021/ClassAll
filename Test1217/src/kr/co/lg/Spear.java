package kr.co.lg;

public class Spear extends Weapon{

	public Spear() {}

	public Spear(int attckPower) {
		super(attckPower);
	}

	@Override
	public void img() {
		System.out.println("∏ÛΩ∫≈Õ¿« ∏ˆø° ±∏∏€¿Ã ≥≥¥œ¥Ÿ.");
	}

	@Override
	public String toString() {
		return "SPEAR";
	}
}
