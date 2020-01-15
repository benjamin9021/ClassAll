package kr.co.ca;

import kr.co.samsung.BMW;
import kr.co.samsung.Person2;
import kr.co.samsung.SM5;
import kr.co.samsung.Sonata;

public class MainEx4 {

	public static void main(String[] args) {

		Sonata s1 = new Sonata();
		Sonata s2 = new Sonata();
		BMW b1 = new BMW();
		BMW b2 = new BMW();
		BMW b3 = new BMW();
		
		Sonata[] sArr = {s1,s2};
		BMW[] bArr = {b1,b2,b3};
		
		Person2 lee = new Person2(sArr,bArr,null);
		
		SM5[] s5Arr = {new SM5()};
		
		Person2 kim = new Person2(sArr,bArr,s5Arr);
		
		
		
		
		
	}

}
