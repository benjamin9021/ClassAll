package kr.co.ca;

import com.naver.Camera;
import com.naver.Phone;
import com.naver.SmartPhone;

public class MainEx {

	public static void main(String[] args) {

		SmartPhone iPhone1 = new SmartPhone();
		
		iPhone1.call("010-000-0000");
		
		Phone iPhone2 = new SmartPhone();
		iPhone2.call("010-0005215-0545454");
		
		Camera iPhone3 = new SmartPhone();
		
		SmartPhone obj = null;
		
		if (iPhone3 instanceof SmartPhone) {
			obj = (SmartPhone) iPhone3;
			obj.call("114");
		}
				
	}

}
