package kr.co.ca;

import java.math.BigInteger;

public class MainEx3 {
	
	public static void main(String[] args) {
		//	BigInteger, long : 8 = 64bit...63bit
		BigInteger bigNum1 = new BigInteger("999999999999999999");
		BigInteger BigNum2 = new BigInteger("999999999999999999");
		
		BigInteger result = bigNum1.add(BigNum2);
		System.out.println(result);
		
		System.out.println(":::::::::");
		BigInteger result2 = bigNum1.multiply(BigNum2);
		System.out.println(result2);
		
		System.out.println(":::::::::");
		BigInteger[] arr = bigNum1.divideAndRemainder(BigNum2);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		System.out.println("::::::::::::");
		
		BigInteger result3 = bigNum1.subtract(BigNum2);
		System.out.println(result3);
		
		System.out.println("::::::::::");
		
		BigInteger result4 = bigNum1.divide(BigNum2);
		System.out.println(result4);
		
		
		
		
	}

}
