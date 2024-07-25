package com.DesignPattern.ChainOfResponsibility;

public class Main {

	public static void main(String[] args) {
		ValidationFactory validate = new ValidationFactory();
		ValidationChain chain = validate.getChain();
		boolean validNode = chain.isValidNode(1000);
	}

}
