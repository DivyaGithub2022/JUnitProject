package junits;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnnotationsExample {
	
	@BeforeAll
	//Before All and After All annotations should always be STATIC in JUnit
	public static void allMethod1() {
		
		System.out.println("Inside Before All Annotation");
	}
	
	@BeforeEach
	public void method1() {
		
		System.out.println("Inside Before each");
	}
	
	@Test
	public void addTest1() {
		
		assertEquals(35, Calculator.add(11, 24));
		assertTrue(true);
		
		//System.out.println("Assert true");
		
		String[] array1 = {"One", "Two", "Three"};
		String[] array2 = {"One", "Two", "Three"};
		
		assertArrayEquals(array1, array2);
		//assertNotEquals(array1, array2, "Array not equal");
		
		System.out.println("Inside Test1");
	}
	
	@Test
	public void addTest2() {
		
		assertEquals(34, Calculator.add(10, 24));
		System.out.println("Inside Test2");
	}
	
	@AfterEach
	public void method2() {
		
		System.out.println("Inside After each");
	}
	
	@AfterAll
	public static void allMethod2() {
		
		System.out.println("Inside After All Annotation");
	}

}
