package com.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import com.telusko.learning.Shapes;


class TestBeforeAfter 
{
	Shapes shape;
	

	
	@BeforeEach
	 void init()
	{
		shape=new Shapes();
		System.out.println("Before test");
	}

	@Test
	//@EnabledOnOs(OS.WINDOWS)
	//@EnabledOnJre(JRE.JAVA_11)
	//@EnabledForJreRange(min=JRE.JAVA_8, max=JRE.JAVA_11)
	void testComputeSquareArea() 
	{
		assumeTrue(true);
		assertEquals(78.5, shape.computeCircleArea(5));
		System.out.println("Actual test running  testComputeSquareArea");
		
	}
	
	@Test
	@Disabled
	void testComputerectangleArea() 
	{
		
		assertEquals(78.5, shape.computeRectangleArea(5, 5));
		System.out.println("Actual test running");
		
	}
	
	
	@Test
	@DisplayName("testing area of circle method")
	void testComputeCircleArea() 
	{
		
		assertEquals(78.5, shape.computeCircleArea(5));
		System.out.println("Actual test running");
		
	}
	
	@AfterEach
	void destroy()
	{
		System.out.println("After test clean up");
	}


}
