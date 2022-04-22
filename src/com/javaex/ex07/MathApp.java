package com.javaex.ex07;

public class MathApp {

	public static void main(String[] args) {
		
		Math m1 = new Math();
		
		System.out.println(m1.plus(2, 5)); // parameter로 구분해서 찾아간다 (정수+정수)
		System.out.println(m1.plus(3.2, 5)); // (실수+정수)
		System.out.println(m1.plus(5, 3.2)); // (정수+실수)
		System.out.println(m1.plus(3.2, 5.1)); // (실수+실수)
		
	}

}
