package com.javaex.ex19;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		double result;
		int num;
		
		num = sc.nextInt();
		
		try {
			result = 100/num; // 만약 ArithmeticException 예외상황발생하면 
			//print result 실행하지 않고 catch문으로 go
			System.out.println(result);
		}catch(ArithmeticException e) {
			//예외 상황 발생시
			System.out.println("0으로 나눌 수 없습니다.");
		}finally {
			System.out.println("finally영역"); // 공통 부분
		}
		
		
		
		sc.close();
	}

}
