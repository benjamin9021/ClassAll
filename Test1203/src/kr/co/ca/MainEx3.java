package kr.co.ca;

public class MainEx3 {

	public static void main(String[] args) {
		
		String test1 = "  I love school.  ";
		String test2 = "  I like school.";
		String test3 = "I hate school.html";
		String test4 = "java#jsp#servlet#spring";
		
		System.out.println(":::::::::::::::::::::");
		System.out.println(test1);
		System.out.println(":::::::::::::::::::::");
		
		// 1.test1 객체의 trim()메서드를 이용하여 test1 객체의 좌우 빈 공간을 제거한 후
		// 이를 msg 변수에 저장한 후 출력하시오.
		
		String msg = test1.trim();
		System.out.println(msg);
		
		System.out.println(":::::::::::::::::::::");
		
		// 2. test1 객체의 indexOf()메서드를 이용하여 test1 객체의 문자 I의 인덱스를 
        // idx 변수에 저장한 후 출력하시오
				
		int idx  = test1.indexOf('I');
		System.out.println(idx);
		
		System.out.println(":::::::::::::::::::::");
		
		// 3. test3 객체의 equals()메서드를 이용하여 test3 객체와 test2 객체가 동등한 객체인지
        // 여부를 확인하시오.
		
		boolean a = test3.equals(test2);
		System.out.println(a);
		
		System.out.println(":::::::::::::::::::::");
	
		// 4. test2 객체의 contains()메서드를 이용하여
        // test2 객체에 문자 s가 들어있는지 확인하시오.

		
		boolean b = test2.contains("s");
		System.out.println(b);
		
		System.out.println(":::::::::::::::::::::");
		
		// 5. test1 객체의 length()메서드를 이용하여
        // test1 객체의 길이를 출력하시오.

		
		System.out.println(test1.length());
		
		System.out.println(":::::::::::::::::::::");
		
		// 6. test3 객체의 startWith()메서드를 이용하여
        // test3 객체가 I로 시작하는지 여부를 확인하시오.

		
		boolean c = test3.startsWith("I");
		System.out.println(c);
		
		System.out.println(":::::::::::::::::::::");
		
		// 7. test3 객체의 endWith()메서드를 이용하여
        // test3 객체의 끝이 html인지 확인하시오. 
		
		boolean d = test3.endsWith("html");
		System.out.println(d);
		
		System.out.println(":::::::::::::::::::::");
		
		// 8. test4 객체의 split()메서드를 이용하여 test4 객체를
		// #을 기준으로 단어들을 분리하여 arr 변수에 저장하시오.
		
		String[] arr = test4.split("#");
		System.out.println(arr);
		
		System.out.println(":::::::::::::::::::::");
		
		// 9. test3 객체의 replace()메서드를 이용하여 test3 객체의 hate를 miss로 수정하시오.
		
		test3 = test3.replace("hate", "miss");
		System.out.println(test3);
		
		System.out.println(":::::::::::::::::::::");
		
		// 10. test1 객체의 toUpperCase()메서드를 이용하여  test1 객체를
		// 모두 대문자로 변경한 후 msg 변수에 대입한 후에 출력하시오.
		
		String msg1 = test1.toUpperCase();
		System.out.println(msg1);
		
		System.out.println(":::::::::::::::::::::");
		
		// 11. msg 객체의 toLowerCase()메서드를 이용하여 msg 객체를 
		// 모두 소문자로 변경한 후 msg 변수에 대입한 후에 출력하시오.
		
		msg1 = msg1.toLowerCase();
		System.out.println(msg1);
		
		System.out.println(";;;;;;;;;;;;;;;;;;;;;");
	
	
	}

}
