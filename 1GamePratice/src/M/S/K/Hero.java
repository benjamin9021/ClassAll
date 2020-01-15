package M.S.K;

public class Hero {
	
	private Weapon[] weapons;
	private Weapon hasWeapon;
	
	public Hero() {
		weapons = new Weapon[3];
		weapons[0] = new Bow(1);
		weapons[1] = new Sword(5);
		weapons[2] = new Spear(10);
		
		hasWeapon = weapons[0];
	}

	public Hero(Weapon[] weapons, Weapon hasWeapon) {
		this.weapons = weapons;
		this.hasWeapon = hasWeapon;
	}
	public void attack(Monster mon) {
		if(mon.getHp()<=0) {
			return;
		}
		
		hasWeapon.attack(mon);
		System.out.println("mon의 HP"+ mon.getHp());
	}
	public void changeWeapon(int idx) {
		if (idx <= 0 || idx >= weapons.length) {
			idx = 0;
		}
		hasWeapon = weapons[idx];
		System.out.println(hasWeapon+"으로 변경되었습니다.");
		
	}
	
}
