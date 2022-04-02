package junits;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Month;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametersExample {
	
	@ParameterizedTest
	@ValueSource(strings = {"radar","madam","divya"})
	//value source can be any data type values - string, int etc.
	public void test1(String name) {
		// TODO Auto-generated method stub
		
		assertTrue(StringFunctions.isPalindrome(name));

	}
	
	@ParameterizedTest
	@ValueSource (ints = {1,2,3})
	public void test2(int num) {
		// TODO Auto-generated method stub
		
		assertTrue(num%2 == 0);
		System.out.println("Inside num method");

	}
	
	@ParameterizedTest
	@EnumSource(Month.class)
	public void test3(Month month) {
		
		int monthVal = month.getValue();
		System.out.println(monthVal);
		
		assertTrue(monthVal<12);
		
	}
	
	@ParameterizedTest
	@EnumSource(value=Month.class, names= {"APRIL","JUNE","SEPTEMBER","NOVEMBER"})
	public void test4(Month month) {
		
		assertEquals(30,month.length(true));
	}
	
	@ParameterizedTest
	@EnumSource (value=Month.class, names= {"FEBRUARY"})
	public void test5(Month month) {
		
	    assertEquals(29,month.length(true));
	    assertEquals(28,month.length(false));
	}
	
	@ParameterizedTest
	@MethodSource("DPMethod")
	public void test6(String name) {
		
		assertTrue(StringFunctions.isPalindrome(name));
	}
	
	
	public static Stream<String> DPMethod() {
		
		return Stream.of("radar","mom","dad","racecar");	
	}

}
