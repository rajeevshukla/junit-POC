package com.windstream;

public class CalculatorImpl implements Calculator {

	@Override
	public int calculateTax(int number){
 
		if(number < 0 )
			throw new IllegalArgumentException();
		return number*10/100;
	}

	

}
