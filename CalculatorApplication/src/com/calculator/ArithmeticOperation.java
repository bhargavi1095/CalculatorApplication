package com.calculator;

public class ArithmeticOperation { 
	
	private Operation operation;
	
	public ArithmeticOperation() {
	
	}

	public ArithmeticOperation(Operation operation) {
		super();
		this.operation = operation;
	}
	
	public int execute() {
		return operation.perform();
		
	}

	public Operation getOperation() {
		return operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}

}
