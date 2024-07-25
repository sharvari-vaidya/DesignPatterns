package com.DesignPattern.Decorator;

public class Main3 {
	
	public static void main(String[] args) {
		
		BasePizza bp2= new ExtraCheese(new VegPizza());
		System.out.println(bp2.cost());
		BasePizza bp = new Jalapeno(new ExtraCheese(new VegPizza()));
		System.out.println(bp.cost());
	}

}
