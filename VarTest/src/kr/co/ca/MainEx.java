package kr.co.ca;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;

public class MainEx {
	public static void main(String[] args) {
		boolean zz = true;
		boolean zz2 = false;
		boolean xx = false;
		char ee = 'a';
		char ee2 = 97;
		Cat a4 = new Cat(1,2);
		Dog a3 = new Dog(1,2,"kim");
		long a2 = 32L;
		double a5 = 3.14;
		double a6 = 3.14;
		String a7 = new String ("¾È³ç");
		ArrayList<String> list = new ArrayList<String>();
		HashSet<Integer> set = new HashSet<Integer>();
		HashSet<String> set2 = new HashSet<String>();
		Car t1 = new Car("kia");
		float t3 = 3.14f;
		File f = new File("c:\\");
		Calendar c = Calendar.getInstance();
		Thread tt2 = new Thread();
	}
}
