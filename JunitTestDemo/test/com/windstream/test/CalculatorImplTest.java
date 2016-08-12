package com.windstream.test;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.windstream.CalculatorImpl;

public class CalculatorImplTest {
	
	@Before
	public void setUp(){
		System.out.println("Set Up");
	}
	
	@Test
	public void shouldCalculateTax(){
		System.out.println("Should calculate test");
		//Given/Arrange that
		CalculatorImpl calculatorImpl = new CalculatorImpl();
		int taxableIncome = 20;
		//When /Act
		int tax =	calculatorImpl.calculateTax(taxableIncome);
		//Then//Assert
		//assertEquals(3, tax);
		
		assertThat(2, is(tax));
	}

	
	@Test(expected= IllegalArgumentException.class)
	public void shouldThowIllegalarugumentExWhileCalculatingTax(){
		System.out.println("Should calculate test");
		//Given/Arrange that
		CalculatorImpl calculatorImpl = new CalculatorImpl();
		int taxableIncome = -1;
		//When /Act
			calculatorImpl.calculateTax(taxableIncome);
		//Then//Assert
		//assertEquals(3, tax);
		
		//assertThat(2, is(tax));
	}

	
	
	
	
	
	
	
	
	
	
	
	@Ignore("Pending for later implmentation")
	@Test
	public void shouldCalculateTaxUsingHamcrest(){
		//Given/Arrange that
		CalculatorImpl calculatorImpl = new CalculatorImpl();
		int taxableIncome = 20;
		
		//When /Act
		int tax =	calculatorImpl.calculateTax(taxableIncome);
		
		//Then//Assert
		//assertThat(tax,is(2));
		
		// assertNull(value); -- Hamcrest -- assertThat(actual, nullValue()); 
		// assertSame(expected, actual);  -- assertThat(actual, sameInstance(expected));
		// assertTrue(1 > 3);   --- assertThat(1, greaterThan(3));
	
	}
	
	@After
	public void tearDown(){
		System.out.println("Tear down");
	}
	

}
