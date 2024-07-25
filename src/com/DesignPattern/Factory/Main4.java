package com.DesignPattern.Factory;

public class Main4 {
	public static void main(String[] args) {
		GetShape g= new GetShape();
		DrawShape shape = g.getShape("SQUARE");
		shape.drawShape();
				

	}
}
