package com.DesignPattern.ChainOfResponsibility;

public class Node2 extends ValidationChain {

	public boolean isValidNode(int data) {
		System.out.println("N2" + data);

		return data > 200;
	}

}
