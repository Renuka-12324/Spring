package com.example.SpringIOC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringIocApplication {

	public static void main(String[] args) {


		Employee eRef = new Employee();
		eRef.setEid(101);
		eRef.setEname("Renu");
		eRef.setEadress("Bidar");

		System.out.println("Employee details:" + eRef);

		ApplicationContext context = SpringApplication.run(SpringIocApplication.class, args);

		Employee e1 = context.getBean("employee1", Employee.class);
		Employee e2 = context.getBean("employee2", Employee.class);

		System.out.println("Employee details: "+ e1);
		System.out.println("Employee details: "+ e2);

	}

}
