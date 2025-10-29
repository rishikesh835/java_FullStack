package com.learning.springJPA;

import com.learning.springJPA.model.Student;
import com.learning.springJPA.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(SpringJpaApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);;

		Student s = new Student();
		s.setRollNo(1);
		s.setMarks(54);
		s.setName("John");
		repo.save(s);
	}
}
