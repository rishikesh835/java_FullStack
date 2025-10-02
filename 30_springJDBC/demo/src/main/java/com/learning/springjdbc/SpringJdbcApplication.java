package com.learning.springjdbc;

import com.learning.springjdbc.model.Student;
import com.learning.springjdbc.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);
		System.out.println("Hello World!");
		Student s = context.getBean( Student.class);

		s.setRollNo(101);
		s.setMarks(76);
		s.setName("Rahul");

		StudentService studentService = context.getBean(StudentService.class);

		studentService.addStudent(s);

		List<Student> studentList = studentService.getStudents();
		System.out.println(studentList);
	}

}
