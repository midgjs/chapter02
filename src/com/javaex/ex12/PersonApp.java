package com.javaex.ex12;

public class PersonApp {

	public static void main(String[] args) {
		/*
		Person p01 = new Person("이재훈", 39);
		//System.out.println(p01.toString());  
		//System.out.println(p01); //ㄴ와 같다(println의 기능중 하나)  
		p01.showInfo();
		*/
		
		/*
		Student s01 = new Student("서울고등학교");
		System.out.println(s01.toString());
		*/
		
		/*
		Student s02 = new Student();
		s02.setName("이재훈");
		s02.setAge(49);
		s02.setSchoolName("서울고등학교");
		
		//System.out.println(s02.toString());
		*/
		
		Student s03 = new Student("황일영", 33, "서울고등학교");
		System.out.println(s03.getName());
		System.out.println(s03.toString());
		s03.showInfo();
		
		s03.showInfo();
	}

}
