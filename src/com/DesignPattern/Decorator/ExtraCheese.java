package com.DesignPattern.Decorator;

public class ExtraCheese extends DecoratorToppingClass{

	
	private BasePizza basePizza;
	
	
	public ExtraCheese(BasePizza basePizza) {
		super();
		this.basePizza = basePizza;
	}



	@Override
	int cost() {
		return basePizza.cost()+10;
	}

}
