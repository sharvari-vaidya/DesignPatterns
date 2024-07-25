package com.DesignPattern.Factory;

public class GetShape {
	
	public DrawShape getShape(String shape) {
		
		switch(shape) {
		case "CIRCLE":return new Circle();
		case "SQUARE":return new Square();
		case "RECTANGLE":return new Rectangle();
		default: return null;
		}
		
	}

}
