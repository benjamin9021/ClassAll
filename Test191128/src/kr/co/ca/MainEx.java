package kr.co.ca;

import com.naver.Department;
import com.naver.EmployeeDTO;
import com.naver.Test1;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		EmployeeDTO kim = new EmployeeDTO();
		EmployeeDTO lee = new EmployeeDTO();
		
		Department d0 = kim.getdInfo();
		System.out.println(d0);
		
		Department realDep = new Department();
		
		kim.setdInfo(realDep);
		
		d0 = kim.getdInfo();
		
		String dName = d0.getdName();
		System.out.println(dName);
		
		String did0 = d0.getDid();
		System.out.println(did0);
		
		String dLocation = d0.getdLocation();
		System.out.println(dLocation);
		
		String dTel = d0.getdTel();
		System.out.println(dTel);
		
		
		
		
		
		
		
		
		
		Department dep1 = new Department();
		Department dep2 = new Department();
		
		String did1 = dep1.getDid();
		
		String did2 = dep2.getDid();
		
		System.out.println(did1); 
		System.out.println(did2);
		
		dep1.setDid(new String("d001")); 
		
		did1 = dep1.getDid();
	
		dep2.setDid(new String("d002"));
		
		did2 = dep2.getDid();
		
		
		
		System.out.println(did1);
		System.out.println(did2);
		
		
		
		

		System.out.println(":::::::::::::");
		
		
		Test1 t1 = new Test1();
		
		System.out.println(t1.a);
		System.out.println(t1.getB());
		System.out.println(t1.getC());
		System.out.println(t1.getD());
		
		
		t1.setD(21);

	}

}
