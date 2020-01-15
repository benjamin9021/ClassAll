package kr.co.ca;

import com.naver.Camera;
import com.naver.Phone;
import com.naver.Smartphone;

public class MainEx {

	public static void main(String[] args) {

		Smartphone gal10 = new Smartphone();
		
		gal10.call("010-0000-0000");
		
		Phone gal4 =  new Smartphone();
		gal4.call("545454");
		
		Camera gal3= new Smartphone();
		
		Smartphone obj = null;
		
		if (gal3 instanceof Smartphone) {
			obj = (Smartphone) gal3;
			obj.call("112");
		}
		
	}

}
