package M.S.K;

public class Bow extends Weapon {
	
	public Bow() {
	}

	public Bow(int attackPower) {
		super(attackPower);
	}

	@Override
	public void img() {
		System.out.println("화살이 빛발칩니다.");
	}

	@Override
	public String toString() {
		return "활";
	}

	
	

}
