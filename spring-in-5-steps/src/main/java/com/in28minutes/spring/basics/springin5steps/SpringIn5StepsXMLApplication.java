package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.springin5steps.xml.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIn5StepsXMLApplication {

	//What are the beans?
	//What are the dependencies ofa bean?
	//Where to Search for a bean?

	private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsXMLApplication.class);

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
			"applicationContext.xml")) {

			logger.info("Beans loaded -> {}",
				(Object) applicationContext.getBeanDefinitionNames());
			XMLPersonDAO personDao = applicationContext.getBean(XMLPersonDAO.class);
			System.out.println(personDao);
			System.out.println(personDao.getXMLJdbcConnection());
		}
	}

}
