package com.telusko.service;

import com.learning.dao.Course;

public class PurchaseCourse 
{
	private Course course;
	
	public boolean proceedWithCourse(Course course)//Course course=new JavaCourse();
	{
		return course.coursePurchased();

	}

}
