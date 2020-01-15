package com.naver;

import java.util.ArrayList;

public class MemberDAO {
	//db를 이용하기 전에 우리는 어레이 리스트 이용
	public static ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
	
	public void insert(MemberDTO dto) {
		list.add(dto);
	}
	
	public ArrayList<MemberDTO> getList() { // 다 정보를 가져옴
		return list;
	}
	
	public MemberDTO getMemberDTOById(String id) { //하나의 정보를 가져오는거 
		int idx = list.indexOf(new MemberDTO(id, null, 0));
		if (idx != -1) {
			return list.get(idx);
		}else {
			return null;
		}
	}

	public void update(MemberDTO dto) {  // 신규 회원 정보 id 기존 id = 신규 id  기존 회원정보 id (name, age) name!=name age!=age
		int idx = list.indexOf(dto);
		if (idx != -1) {
			list.set(idx, dto);
		}else {
			System.out.println("회원이 아닙니다.");
		}
	}
	
	public void delete(String id) {
		MemberDTO dto = new MemberDTO(id, null, 0);
		list.remove(dto);
	}

}
