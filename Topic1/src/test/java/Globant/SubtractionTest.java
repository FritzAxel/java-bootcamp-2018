package Globant;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubtractionTest {

	@Test
	public void subtractionTest() {
		Calculator test = new Calculator();
		int result = test.subtraction(3, 2);
		assertEquals(1, result);
	}

}
