package com.javaex.ex14;

public class PointApp {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle("빨강", "검정", 4, 4);
		Rectangle r2 = new Rectangle("주황", "검정", 5, 5);
		
		Rectangle[] rArray = new Rectangle[2]; 
		rArray[0] = r1;
		rArray[1] = r2;
		
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		
		Triangle t1 = new Triangle("빨강", "검정", 4, 4);
		Triangle t2 = new Triangle("보라", "검정", 10, 10);
		
		Triangle[] tArray = new Triangle[2]; 
		tArray[0] = t1;
		tArray[1] = t2;
		
		for(int i=0; i<tArray.length; i++) {
			tArray[i].draw();
		}
		
		
		Circle c1 = new Circle("보라", "빨강", 3);
		Circle c2 = new Circle("보라", "검정", 3);
		
		Circle[] cArray = new Circle[2];  
		cArray[0] = c1;
		cArray[1] = c2;
		
		for(int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		
	}

}
