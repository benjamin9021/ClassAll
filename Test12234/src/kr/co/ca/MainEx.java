package kr.co.ca;

import com.naver.Command;

interface Dog {
	void show(String name);
}

interface Cat {
	void run(String to, String who);
}

public class MainEx {

	public static void main(String[] args) {
		
		Cat c1 = (String to, String who) -> {
			System.out.println(who +"(이)가"+" "+to+"으로"+" "+"달립니다.");
		};
		
		c1.run("옥상", "고냠니");
		
		Dog d1 = (String name) -> {
			System.out.print(name);
			System.out.println("(이)가 춤을 춥니다.");
		};
	
		d1.show("happy");
	
		Command insert = () -> {
			System.out.println("회원 정보를 입력했습니다.");
		};
		insert.execute();
	}
	
}
