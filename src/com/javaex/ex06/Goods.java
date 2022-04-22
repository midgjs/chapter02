package com.javaex.ex06;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	//생성자
	public Goods() { //기본생성자(디폴트)
		//***** 메모리에 올리는일(클래스로 인스턴스화)
		//로직(없으면 public goods() 생략가능
		//ㄴ 생성자가 한 개라도 있으면 기본 생성자를 추가 하지 않는다. 디폴트값이 필요없는 경우를 고려
	}	
	public Goods(String name) { 
		//***** 메모리에 올리는일(클래스로 인스턴스화)
		//로직
		this.name = name;
	}
	/*
	public Goods(int price) { 
		//***** 메모리에 올리는일(클래스로 인스턴스화)
		//로직
		this.price = price;
	}
	*/
	public Goods(String name, int price) {
		//***** 메모리에 올리는일(클래스로 인스턴스화)
		this.name=name;
		this.price=price;
	}
	
	//메소드 gs
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//메소드 일반
	public void showinfo() {
		System.out.println("상품이름: " + name);
		System.out.println("가격: " + price);
		System.out.println("");
		
	}
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	

}
