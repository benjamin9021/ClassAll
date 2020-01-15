package com.naver;

import java.util.Scanner;

public class UpdateCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("ID�� �Է��ϼ���.");
		String id = sc.nextLine();
	      
	    System.out.println("Name�� �Է��ϼ���.");
	    String name = sc.nextLine();
	      
	    System.out.println("Age�� �Է��ϼ���.");
	    int age = sc.nextInt();
	    sc.nextLine();
	    
	    MemberDAO dao = new MemberDAO();
//	    MemberDTO dto = new MemberDTO(id, name, age);
	   
	    dao.update(new MemberDTO(id, name, age));
		
	}

}