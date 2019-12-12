package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringIn5StepsScopeApplication {

	//What are the beans?
	//What are the dependencies ofa bean?
	//Where to Search for a bean?
	private static Logger LOGGER =
		 LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext =
			SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		PersonDAO personDao =
			applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO2 =
			applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}",
			personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());

		LOGGER.info("{}", personDAO2);
		LOGGER.info("{}", personDAO2.getJdbcConnection());
	}

}
