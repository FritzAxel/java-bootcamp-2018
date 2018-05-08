package Globant;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void multiplicateTest() {
		Calculator test = new Calculator();
		int result = test.multiplicate(3, 2);
		assertEquals(6, result);
	}
	
	@Test
	public void subtractionTest() {
		Calculator test = new Calculator();
		int result = test.subtraction(3, 2);
		assertEquals(1, result);
	}
	
	@Test
	public void additionTest() {
		Calculator test = new Calculator();
		int result = test.addition(2, 3);
		assertEquals(5, result);
	}


}
