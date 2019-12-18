package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.springin5steps.xml.XMLPersonDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan("com.in28minutes.spring.basics.springin5steps")
public class SpringIn5StepsXMLApplication {

	//What are the beans?
	//What are the dependencies ofa bean?
	//Where to Search for a bean?

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext =
			new ClassPathXmlApplicationContext("applicationContext.xml");

		XMLPersonDAO personDAO =
			applicationContext.getBean(XMLPersonDAO.class);

		System.out.println(personDAO);
		System.out.println(personDAO.getXMLJdbcConnection());
	}

}
