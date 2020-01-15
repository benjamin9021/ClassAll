package com.naver;


import java.util.Scanner;

public class InsertCommand implements Command{  // 커맨드를 구현

	@Override
	public void execute(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("ID를 입력하세요.");
		String id = sc.nextLine();
		
		System.out.println("Name을 입력하세요.");
		String name = sc.nextLine();
		
		System.out.println("Age를 입력하세요.");
		int age = sc.nextInt();
		sc.nextLine();   // 언터키 종료를 위해서 반드시 nextline메서드를 입력해야한다.
	
		MemberDTO dto = new MemberDTO(id, name, age);
		
		MemberDAO dao = new MemberDAO();
		dao.insert(dto);
		
	} 

}
