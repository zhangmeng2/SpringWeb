/*package com.application;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

import com.test.Test;
@Configuration
@ComponentScan(basePackages="com")
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext appContext=new AnnotationConfigApplicationContext(Application.class);
       WebApplicationContext  appContext=new XmlWebApplicationContext();
       Test test=appContext.getBean(Test.class);  
       test.MessagePrinter();
	}

}
*/