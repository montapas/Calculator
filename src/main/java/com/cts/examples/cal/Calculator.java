package com.cts.examples.cal;

public class Calculator implements ICalculator {

	public int sum(int a, int b) {
		if (a == 1) {
		 a=2;
		} else if (a== 2) {
		   a=3;
		}
		return a + b;
	}
	 
	public int subtraction(int a, int b) {
		return a - b;
	}
	 
	public int multiplication(int a, int b) {
		
		return a * b;
	}

	public int divison(int a, int b)  {
		return a / b;
	}
	 
	public boolean equalIntegers(int a, int b) {
		boolean result = false;
              
		if (a == b) {
			result = true;
		}
 
		return result;
	}
}
