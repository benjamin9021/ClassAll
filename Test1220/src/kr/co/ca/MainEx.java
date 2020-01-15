package kr.co.ca;

import java.util.Scanner;

import com.naver.Command;
import com.naver.DeleteCommand;
import com.naver.GetListCommand;
import com.naver.GetMemberDTOByIdCommand;
import com.naver.InsertCommand;
import com.naver.UpdateCommand;

public class MainEx {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Command[] com = {new InsertCommand()
						,new GetListCommand()
						,new GetMemberDTOByIdCommand()
						,new UpdateCommand()
						,new DeleteCommand()
						};
		boolean isTure = true;
		while (isTure) {
			System.out.println("0: 등록, 1: 전체 조회, 2: 회원 조회, 3: 회원 수정, 4: 회원 삭제, 5: 종료");
			int menu = sc.nextInt();
			sc.nextLine(); // 반드시 엔터종료를 위해 nextLine() 입력할 것!
			
			if (menu != com.length) {
				Command c = com[menu];
				if (c != null) {
					c.execute(sc);
				}
//				com[menu].execute(sc);  
			}else {
				isTure = false;
			}
		}
		sc.close();
	}
}
