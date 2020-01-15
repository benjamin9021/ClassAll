package com.samsung;

import java.util.Scanner;

public class GetMemberDTOByIdCommand implements Commnad {

	@Override
	public void execute(Scanner sc) {
		System.out.println("idÀÔ·Â");
		String id = sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.getMemberDTOByID(id);
		
		System.out.println(dto);
		
		
	}

}
