package com.javaex.ex04;

public class Point {

	private int x;
	private int y;
	
	public void setXgraph(int a) {
		x=a;
	}
	
	public void setYgraph(int b) {
		y=b;
	}
	
	public int getXgraph( ) {
		return x;
	}
	
	public int getYgraph() {
		return y;
	}
	
	public void draw() {
		
		System.out.println("점 [x=" + x + ", y=" + y + "]을 그렸습니다");
	}
	
	
	
}
