package com.DesignPattern.ChainOfResponsibility;

public class Node1 extends ValidationChain {


	public boolean isValidNode(int data) {
		System.out.println("N1" + data);
		return data > 200 ;
	}

}
