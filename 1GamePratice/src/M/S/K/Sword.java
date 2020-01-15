package M.S.K;

public class Sword extends Weapon{
	
	public Sword() {
	}

	public Sword(int attackPower) {
		super(attackPower);
	}

	@Override
	public void img() {
		System.out.println("검으로 마구 뱁니다.");
	}

	@Override
	public String toString() {
		return "검";
	}

	
	
}
