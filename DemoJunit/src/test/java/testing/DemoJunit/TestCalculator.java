package testing.DemoJunit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	
	Calculator c = null;
	@Before
	public void setUp()
	{
	 c = new Calculator();
	}
	
	@Test 
		public void TestAdd()
	{
		assertEquals(5,c.Add(2, 3));
	}

}
