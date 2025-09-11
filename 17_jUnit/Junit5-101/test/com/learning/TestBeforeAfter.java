package com.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
	void testComputeSquareArea() 
	{
		
		assertEquals(78.5, shape.computeCircleArea(5));
		System.out.println("Actual test running");
		
	}
	
	@Test
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
