package com.javaex.ex03;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	//생성자
	
	//메소드 - gs (단축키 alt + shift + s -> r)
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		if(price<0) {
			this.price=0;
		} else {
			this.price = price;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	//메소드 - 일반
	public void showInfo() {
		System.out.println("상품이름: " + name);
		System.out.println("가격: " + price);
		System.out.println("");
		
	}
	
}
//return 값에는 this. 생략가능(헷갈리지 않음)
//name=name;이 되면 헷갈리기 때문에 this 표시