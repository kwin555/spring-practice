package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.componentscan.ComponentDAO;
import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.in28minutes.spring.basics.componentscan")
public class SpringIn5StepsComponentScanApplication {

	//What are the beans?
	//What are the dependencies ofa bean?
	//Where to Search for a bean?
	private static Logger LOGGER =
		 LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext =
			new AnnotationConfigApplicationContext(SpringIn5StepsComponentScanApplication.class);
		ComponentDAO componentDAO =
			applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}",
			componentDAO);
	}

}
