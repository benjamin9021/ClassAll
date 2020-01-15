package com.samsung;

import java.util.Scanner;

public class DeleteCommand implements Commnad {

	@Override
	public void execute(Scanner sc) {
		System.out.println("삭제할 id 입력");
		String id = sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		dao.delete(id);
		
	}

}
