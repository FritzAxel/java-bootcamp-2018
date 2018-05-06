package Globant;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplicateTest {

	@Test
	public void multiplicateTest() {
		Calculator test = new Calculator();
		int result = test.multiplicate(3, 2);
		assertEquals(6, result);
	}

}
