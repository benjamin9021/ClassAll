package m.s.k;

public abstract class Weapon {

	private int attackPower;
	
	public abstract void img();
	
	public void attack(Monster mon) {
		img();
		int aHp = mon.getHp() - attackPower;
		mon.setHp(aHp);
	}
	public Weapon() {
		// TODO Auto-generated constructor stub
	}

	public Weapon(int attackPower) {
		super();
		this.attackPower = attackPower;
	}
	
	
	
}
