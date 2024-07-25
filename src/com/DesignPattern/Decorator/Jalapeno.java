package com.DesignPattern.Decorator;

public class Jalapeno extends DecoratorToppingClass{

	private BasePizza basePizza;
	
	
	public Jalapeno(BasePizza basePizza) {
		super();
		this.basePizza = basePizza;
	}

	@Override
	int cost() {
		return basePizza.cost()+10;
	}

}
