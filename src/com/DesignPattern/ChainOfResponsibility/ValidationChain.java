package com.DesignPattern.ChainOfResponsibility;

public abstract class ValidationChain {
	ValidationChain chain;

	public ValidationChain getNextNode() {
		return this.chain;
	}

	public void setNExtNode(ValidationChain validationChain) {
		this.chain = validationChain;

	}

	public abstract boolean isValidNode(int data);

	public boolean isValid(int data) {
		boolean res = false;
		boolean validNode = isValidNode(data);

		if (validNode == true && chain != null) {
			res = chain.isValid(data);

		}
		return res;
	}

}
