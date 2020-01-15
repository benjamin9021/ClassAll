package com.naver;

public abstract class SuperEx {
	
	private int a;

	public abstract void me1();
	
	public abstract void me2();
	
	public abstract void me3();
	
	public abstract void me4();
	
		
	public SuperEx() {}

	public SuperEx(int a) {
		super();
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	
}
