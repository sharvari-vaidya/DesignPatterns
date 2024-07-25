package com.DesignPattern.Strategy;

public class main1 {
	
	public static void main(String[] args) {
		Fly fly=new LongFly();
		StrategyPattern s= new StrategyPattern(fly);
		s.fly();
	}

}
