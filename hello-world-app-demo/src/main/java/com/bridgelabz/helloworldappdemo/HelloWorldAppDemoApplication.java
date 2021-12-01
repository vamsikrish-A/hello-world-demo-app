package com.bridgelabz.helloworldappdemo;

import com.bridgelabz.helloworldappdemo.component.DemoBean;
import com.bridgelabz.helloworldappdemo.component.EmployeeBean;
import com.bridgelabz.helloworldappdemo.controller.HelloRestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class HelloWorldAppDemoApplication {
	public static final Logger logger =  LoggerFactory.getLogger(HelloWorldAppDemoApplication.class);

	public static void main(String[] args) {
		logger.debug("Hello world from Vamsi Krishna");
		ApplicationContext context = SpringApplication.run(HelloWorldAppDemoApplication.class, args);
//		logger.debug("Checking Context: {}", context.getBean(DemoBean.class));
//		logger.debug("\n*** Example Using @AutoWIre Annotation on property ***");
//
		DemoBean demoBean = context.getBean(DemoBean.class);
		logger.info("Dean Bean = "+demoBean.toString());
		System.out.println(context.getBean(HelloRestController.class));
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(104);
		employeeBean.seteName("Spring Framework");
		employeeBean.showEmployeeDetails();
	}

}
