package junits;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestExample {
	
	@TestFactory
	public List<DynamicTest> Method1() {
		
		return Arrays.asList(
				
				DynamicTest.dynamicTest("Positive Test", ()-> assertTrue(StringFunctions.isPalindrome("madam"))),
				
				DynamicTest.dynamicTest("Negative Test", ()-> assertTrue(StringFunctions.isPalindrome("divya")))

				);
		
	}

}
