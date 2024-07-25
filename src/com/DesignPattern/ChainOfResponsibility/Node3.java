package com.DesignPattern.ChainOfResponsibility;

public class Node3 extends ValidationChain {

	@Override
	public boolean isValidNode(int data) {
		System.out.println("N3" + data);
		return data > 300;
	}

}
