package com.naver;

public class Test {
	


	
	private void sossu(int num) {
		// TODO Auto-generated method stub
		
	}


	public void me9() {
		String str = "hello#world#good#morning#!!!";
		String[] arr = str.split("#");
		
		for (int i = 0; i < arr.length; i++) {
			String msg = arr[i];
			System.out.println(msg);
		}
		
	}
	
	//Dog[] arr = {new Dog(1,"kim"),new Dog(2,"lee"),new Dog(3,"park"),new Dog(4,"kang")};
	
	// Dog d = arr[0]; 
	// String master = d.getMaster()
	// 
	
	public void me8() {
		
		String[] names = {"kim","lee","park","kang"};
		
		Dog[] arr = new Dog[4];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = new Dog(i+1, names[i]);
		}
		
		for (int i = 0; i < arr.length; i++) {
			Dog d = arr[i];
			String master = d.getMaster();
			System.out.println(master);
		}

	}
	
		
		

	
	public void me7() {
		
		int[] arr = new int [16];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i % 4;
		}
		for (int i = 0; i < arr.length; i++) { 
		int n = arr[i];
		System.out.println(n);
		}
	}
	
	public void me63() {
		boolean[] arr = new boolean [5];
		
		boolean s = false;		
		for(int i = 0; i < arr.length; i++) {
			s = !s;
			arr[i] = s;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	// 0,1,0,1,0,1,0,1
	public void me62() {
		int[] arr = new int [8];
		
		arr[0] = 0;
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = 1 - arr[i-1];
			
		}
		
	}
	
	//true,true,true,true,true,true
	
	public void me61() {
		boolean[] arr = new boolean[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = true;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void me6() {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	public void me53() {
		Dog[] arr = {new Dog(1, "kim"), new Dog(2, "lee"), new Dog(3, "park"), new Dog(4, "kang")};
	}
	
	public void me52() {
		boolean[] arr = {true, true, false, false, true, true, false};
	}
	
	public void me51() {
		int[] arr = {1,1,2,3,5,8,13,21,24};
		
	}
	
	public void me5() {
		
		int[] arr = {2, 3, 5, 7, 11, 13};
		
	}
	
	public void me4() {
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	
	
	
	
	public int[] me3() {
		int[] arr = {1,2,3,4,5};
		
		return arr;
		
	}
	// 이렇게 쓸필요없다! 배열로 쓰면된다. ( me1,me2)
	public void me2() {
		int a0 = 1;
		int a1 = 2;
		int a2 = 3;
		int a3 = 4;
		int a4 = 5;
		int a5 = 6;
		
		for(int i =0; i < 6; i++) {
			int bi = i + 1; 
		}
	}
	
	public void me1() {
		int a = 10;
		int b = 20;
		int c = 30;
		


	
	}
	
}
