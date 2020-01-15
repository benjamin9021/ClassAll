package kr.co.ca;

import java.math.BigDecimal;

public class MainEx4 {

	public static void main(String[] args) {
		
		BigDecimal big1 = new BigDecimal("2.0");
		BigDecimal big2 = new BigDecimal("1.1");
		
		System.out.println(2.0- 1.1);
		
		BigDecimal result = big1.subtract(big2);
		System.out.println(result);
		
		BigDecimal result2 = big1.add(big2);
		System.out.println(result2);
		
		BigDecimal result3 = big1.multiply(big2);
		System.out.println(result3);
		
		BigDecimal result4 = big1.divide(big2);
		System.out.println(result4);
		
	}
	
}
