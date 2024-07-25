package com.DesignPattern.ChainOfResponsibility;

public class ValidationFactory {
	static ValidationChain chain = null;

	ValidationChain getChain() {

		ValidationChain n1 = new Node1();
		ValidationChain n2 = new Node2();
		ValidationChain n3 = new Node3();
		n1.setNExtNode(n2);
		n2.setNExtNode(n3);
		n3.setNExtNode(null);
		chain = n1;
		return chain;

	}
}
