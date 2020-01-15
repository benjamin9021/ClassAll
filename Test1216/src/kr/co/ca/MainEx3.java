package kr.co.ca;

import kr.co.samsung.BMW;
import kr.co.samsung.Car;
import kr.co.samsung.Person1;
import kr.co.samsung.Sonata;

public class MainEx3 {

	public static void main(String[] args) {

		Person1 kim = new Person1(new Sonata(), new BMW());
		Person1 lee = new Person1(null, new BMW());
		Person1 park = new Person1(new Sonata(), null);
		Person1 choi = new Person1(null, null);
		
		kim.setS(new Sonata()); // 소나타를 한대 갖는게 아니라 다른 소나타를 바꾸는 거다..
		
		Car c = new Car();
		
		
	}

}
