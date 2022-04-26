package com.javaex.ex12;

public class Student extends Person{
	
	//필드
	private String schoolName;
	
	//생성자
	public Student() {
		super(); // 꼭 있어야 하는지?
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
	
	public void showInfo() {
		super.showInfo(); // super -- 부모 메소드
		System.out.println("학교:" + this.schoolName);
	}
		
	@Override
	public String toString() {
		return "Student [schoolName=" + name + ", getName()=" + super.getName() + ", getAge()=" + getAge() + "]";
	}

	
}
