package com.codingdojo.Calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.setOperandOne(10.5);
		calc.setOperation("+");
		calc.setOperandTwo(5.2);
		calc.performOperation();
		System.out.println(calc.getResults());
				
		Calculator calc3 = new Calculator();
		calc3.setOperandOne(10.5);
		calc3.setOperation("-");
		calc3.setOperandTwo(5.2);
		calc3.performOperation();
		System.out.println(calc3.getResults());
		
		Calculator calc2 = new Calculator();
		calc2.setOperandOne(10.5);
		calc2.setOperation("b");
		calc2.setOperandTwo(5.2);
		calc2.performOperation();
		System.out.println(calc2.getResults());
		
		
	}

}