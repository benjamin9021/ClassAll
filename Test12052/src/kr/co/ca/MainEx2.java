package kr.co.ca;

import com.naver.Dog;
import com.naver.Test2;

public class MainEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t = new Test2();
		t.ls1(8, 3);
		t.ls1(3, 8);
		t.ls1(3, 3);
		System.out.println("::::::::::::");
		
		boolean r = t.ls2((byte)8, (byte)3);
		System.out.println(r);
		System.out.println(":::::::::");
		
		byte a = 3;
		byte b = 8;
		r = t.ls2(a, b);
		System.out.println(r);	
		System.out.println("::::::::::");
		
		t.ls3(3000000000L, 8000000000L);
		t.ls3(8000000000L, 3000000000L);
		System.out.println(":::::::::::");
		
		
		r = t.ls4(3f);
		System.out.println(r);
		
		float c = 8.1f;
		boolean l = t.ls4(c);
		System.out.println(l);
		System.out.println("::::::::::::::");

		t.ls5(3.4);
		t.ls5(3.8);
		System.out.println(":::::::::::");
		
		boolean z = t.ls6(new Dog(),new Dog());
		System.out.println(z);
		System.out.println(":::::::::::::");
		
		Dog x1 = new Dog();
		Dog x2 = new Dog();
		Dog y1 = x1;
		
		z = t.ls6(x1, x2);
		System.out.println(z);
		
		z = t.ls6(x1, y1);
		System.out.println(z);
		
	}

}
