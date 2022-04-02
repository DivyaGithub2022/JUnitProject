package junits;

import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class StringFunctionsTest {
	
	@Tag("Sanity")
//	@DisplayName("Positive Test")
	@Test
//	@CustomAnnotationSanityPositive
	public void test1() {
		
		assertTrue(StringFunctions.isPalindrome("racecar"));
		assertTrue(StringFunctions.isPalindrome("madam"));
		System.out.println("racecar method");
	}
	
//	@Tag("Sanity")
//	@DisplayName("Negative Test")
	@Test
//	@CustomAnnotationSanityNegative
	public void test2() {
		
		assertFalse(StringFunctions.isPalindrome("divya"));
		System.out.println("assert false");
	}

}
