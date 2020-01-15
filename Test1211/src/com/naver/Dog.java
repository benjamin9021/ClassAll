package com.naver;

public class Dog {

	private String id;
	private String name;
	private int age;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void call(String name) {
		System.out.println(name+"야.ㄴ이리와!");
	}
	
	
}
