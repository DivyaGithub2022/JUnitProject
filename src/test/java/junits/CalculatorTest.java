package junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;

public class CalculatorTest {
	
	@Tag("Sanity")
	@Test
	public void addTest1() {
		
		assertEquals(24, Calculator.add(11, 24));
		
	}
	
//	@Disabled
	@Tag("Sanity")
	@Test
	public void subTest1() {
		
		assertEquals(24, Calculator.sub(25, 24));
		
	}

}
