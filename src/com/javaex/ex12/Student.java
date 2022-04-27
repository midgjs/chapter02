package com.javaex.ex12;

public class Student extends Person{
	
	//필드
	private String schoolName;
	
	//생성자
	public Student() {
		super(); 
		System.out.println("Student()");
	}
	
	public Student(String schoolName) {
		super();
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}
	
	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}
	
	//메소드 gs
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	//메소드 일반
	public void showInfo() {
		//부모 toString() 그대로 사용하고 싶을 때 super
		System.out.println(super.toString());
		System.out.println("학교:" + this.schoolName);
	}
		
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", getName()=" + name + ", getAge()=" + age + "]";
	}

	
}
