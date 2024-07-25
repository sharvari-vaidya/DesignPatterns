package com.DesignPattern.Strategy;

public class StrategyPattern {

	private Fly flyingStrategy;

	public StrategyPattern(Fly flyingStrategy) {
		this.flyingStrategy = flyingStrategy;
	}
	
	public void fly() {
		flyingStrategy.flyStrategy();
	}

}
