package com.cts.examples.cal;

public class Calculator implements ICalculator {

	public int sum(int a, int b) {
		int j=0;
		int x=0;
		if (x == 0) {
		 j=1;
		} else if (x == 1) {
		 j=2;
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
