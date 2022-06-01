import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest1 {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
				//arrange
				int a = 4231;
				int b = 1234;
				calculator cal = new calculator();
				
				//act
				int actual = cal.add (a, b);
				
				//assert
				int expected = 5465;
				assertEquals (expected, actual);
			}
	
	@Test
	public void testSubstact() {
		//arrange
		int a = 10;
		int b = 5;
		calculator cal = new calculator();
		//act
		int actual = cal.subtract (a, b);
		
		//assert2
		int expected = 5;
		assertEquals (expected, actual);
	}
	
	@Test
	public void Multiply() {
		//arrange
		int a = 3;
		int b = 5;
		calculator cal = new calculator();
		//act
		int actual = cal.multiply (a, b);
		
		//assert2
		int expected = 15;
		assertEquals (expected, actual);
	
	}
	@Test
	public void divide() {
		//arrange
		int a = 15;
		int b = 3;
		calculator cal = new calculator();
		//act
		int actual = cal.divide (a, b);
		
		//assert2
		int expected = 5;
		assertEquals (expected, actual);
	
	}
}