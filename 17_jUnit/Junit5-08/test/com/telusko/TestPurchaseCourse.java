package com.telusko;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.learning.dao.JavaCourse;
import com.telusko.service.PurchaseCourse;

class TestPurchaseCourse {

	@Test
	void testproceedWithCourse() 
	{
		PurchaseCourse pc=new PurchaseCourse();
		boolean status=pc.proceedWithCourse(new JavaCourse());
		assertTrue(status);

	}
	


}
