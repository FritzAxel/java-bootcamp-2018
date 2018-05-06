package Globant;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest {

	@Test
	public void additionTest() {
		Calculator test = new Calculator();
		int result = test.addition(2, 3);
		assertEquals(5, result);
	}

}
