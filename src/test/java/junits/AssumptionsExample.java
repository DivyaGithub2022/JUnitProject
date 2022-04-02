package junits;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AssumptionsExample {
	
	@BeforeAll
	public static void setUp() {
		
		System.setProperty("ENV", "SEV");
		//System.setProperty("ENV", "PROD"); this will fail the test case as the AssumeTrue is checked for "DEV" - invokes 'testFalse' method
	}
	
	@Test
	public void testTrue() {
		
		assumeTrue("DEV".equals(System.getProperty("ENV")));
		
		assertTrue(StringFunctions.isPalindrome("racecar"));
		assertTrue(StringFunctions.isPalindrome("madam"));
		
		System.out.println("Assume True method");
	}
	
	@Test
	public void testFalse() {
		
		assumeFalse("DEV".equals(System.getProperty("ENV")));
		
		System.out.println("Assume False method");
	}

}
