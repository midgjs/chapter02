package com.javaex.ex13;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(4,4);
		
		p1.showInfo();
		
		ColorPoint cp1 = new ColorPoint("red");
		cp1.showInfo();
		
		ColorPoint cp2 = new ColorPoint(10,10,"blue");
		cp2.showInfo();
	}

}
