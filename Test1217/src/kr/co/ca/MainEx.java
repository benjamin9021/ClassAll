package kr.co.ca;

import java.util.Scanner;

import com.naver.Hero;

import kr.co.daum.Monster;
import kr.co.lg.Bow;
import kr.co.lg.Spear;
import kr.co.lg.Sword;
import kr.co.lg.Weapon;
import kr.co.lg.WeaponSpec;

public class MainEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Monster mon = new Monster(WeaponSpec.MONSTER_HP_1);
		
		System.out.println("Load the Weapon Info from DataBase");
		Weapon[] arr = {new Bow(WeaponSpec.BOW_ATTACK_POWER_1), new Sword(WeaponSpec.SWORD_ATTACK_POWER_1), new Spear(WeaponSpec.SPEAR_ATTACK_POWER_1)};
		Weapon hasWeapon = arr[1];
		
		Hero man = new Hero(arr, hasWeapon);
		
		while (true) {
			System.out.println("Select the Menu");
			System.out.println("1: Attack, 2: Switch the Weapon, 3: Game End");
			int menu = sc.nextInt();
			if(menu==1){
				man.attack(mon);
			}else if(menu == 2) {
				for(int i = 0; i <arr.length; i++) {
					System.out.println(i+": "+arr[i]);
				}
				int idx = sc.nextInt();
				man.changeWeapon(idx);
			}else{
				break;
			}
		}

		sc.close();
		
	}

}
