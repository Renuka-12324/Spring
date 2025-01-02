package com.example.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(StudentApplication.class, args);

		Student s1 = context.getBean("student1",Student.class);
		Student s2 = context.getBean("student2",Student.class);

		System.out.println("Student details:"+s1);
		System.out.println("Student details:"+s2);

	}

}
