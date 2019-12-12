package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.spring.basics.springin5steps")
public class SpringIn5StepsBasicApplication {

	//What are the beans?
	//What are the dependencies ofa bean?
	//Where to Search for a bean?

	public static void main(String[] args) {
		ApplicationContext applicationContext =
			new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);
//			SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		BinarySearchImpl binarySearch =
			applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int [] {12, 4, 2},
			3);
		System.out.println(result);
	}

}
