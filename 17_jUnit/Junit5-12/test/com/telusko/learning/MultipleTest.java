package com.telusko.learning;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


class MultipleTest 
{
	ReverseString task;
	
	@BeforeEach
	void init()
	{
		 task=new ReverseString();
	}
	@Nested
	class ReverseStringTest
	{
		@Test
		void testReverseString_OneWord() 
		{
			String str="Java";
			assertEquals("avaJ",task.reverseString(str));
			
		}
		
		@Test
		void testReverseString_MultipleWords()
		{
			
			
			assertEquals("ysae si avaJ",task.reverseString("Java is easy"));
		}

	}
	
	@Nested
	class SortingArrayTest
	{
		@Test
		void testUnsortedArrays() 
		{
			int []unsorted= {4,2,8,6};
			int []expected= {2,4,6,8};
			
			int []actual= task.sortingArray(unsorted);
			
		    assertArrayEquals(expected, actual);

		}
		
		@Test
		void testSortedArrays() 
		{
			int []sorted= {2,4,6,8};
			int []expected= {2,4,6,8};
			
			int []actual= task.sortingArray(sorted);
			
		    assertArrayEquals(expected, actual);

		}
	}
		
		
		


	
	

}
