package kr.co.ca;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainEx2 {

	public static void main(String[] args) {
		
		Date d = new Date(1000);
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		c.setTime(d);
		System.out.println(c.get(Calendar.YEAR));
		
		Date d2 = c.getTime();
		System.out.println(d2);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String msg = sdf.format(d2);
		System.out.println(msg);
	}
	
}
