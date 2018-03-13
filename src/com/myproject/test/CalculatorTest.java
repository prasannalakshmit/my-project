package com.myproject.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.myproject.main.Calculator;

public class CalculatorTest {
	
	private Calculator calc; 

	/*@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calc = new Calculator();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		calc = null;
	}*/

	@Before
	public void setUp() throws Exception {
		calc = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
		calc = null;
	}

	@Test
	public void testAddTwoNumbers() {
		double result = calc.addTwoNumbers(20.32, 10.5);
		assertEquals(30.82, result, 0);
		//fail("Not yet implemented");
	}

}
