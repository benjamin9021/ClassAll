package M.S.K;

public class Spear extends Weapon {

	public Spear() {
	}

	public Spear(int attackPower) {
		super(attackPower);
	}

	@Override
	public void img() {
		System.out.println("¸ó½ºÅÍÀÇ ¸ö¿¡ ±¸¸ÛÀÌ ³³´Ï´Ù.");
	}

	@Override
	public String toString() {
		return "Ã¢";
	}

	
	
	
}
