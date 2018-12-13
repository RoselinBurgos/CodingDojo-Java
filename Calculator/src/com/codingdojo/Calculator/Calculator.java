package com.codingdojo.Calculator;

public class Calculator {
	Double operandOne;
	Double operandTwo;
	String operation;
	Double result;
	
	public Calculator() {
	}
	
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	
	public void performOperation() {
		if(this.operation.equals("+")){
			this.result = this.operandOne + this.operandTwo;
		}
		else if(this.operation.equals("-")) {
			this.result = this.operandOne - this.operandTwo;
		}
		else if(this.operation.equals("*")) {
			this.result = this.operandOne * this.operandTwo;
		}
		else if(this.operation.equals("/")) {
			this.result = this.operandOne / this.operandTwo;
		}
		else {
			System.out.println(this.operation + " is not a valid operation");
		}
	}
	
	public double getResults() {
		return this.result;
	}
}
