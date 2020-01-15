package com.samsung;

import java.util.ArrayList;
import java.util.Scanner;

public class GetListCommand implements Commnad {

	@Override
	public void execute(Scanner sc) {
		
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> list = dao.getList();
		
		MemberDTO dto = new MemberDTO();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
