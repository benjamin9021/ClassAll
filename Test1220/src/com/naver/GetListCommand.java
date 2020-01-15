package com.naver;

import java.util.ArrayList;
import java.util.Scanner;

import com.naver.Command;

public class GetListCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> list = dao.getList();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
//			MemberDTO dto = list.get(i);   위의 코드를 풀어 쓴 것.
//			System.out.println(dto);
			
		}
		
	}

}
