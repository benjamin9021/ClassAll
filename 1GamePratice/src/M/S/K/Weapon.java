package M.S.K;

public abstract class Weapon {
	
	private int attackPower;
	
	public final void attack(Monster mon) {
		img();
		int bHp = mon.getHp();
		int aHp = bHp - attackPower;
		
		mon.setHp(aHp);
	}

	public abstract void img(); 
	
	public Weapon() {}

	public Weapon(int attackPower) {
		this.attackPower = attackPower;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}	
	
}
