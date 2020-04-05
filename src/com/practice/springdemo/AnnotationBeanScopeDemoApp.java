package com.practice.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = applicationContext.getBean("tennisCoach",Coach.class);
		
		Coach alphacoach = applicationContext.getBean("tennisCoach",Coach.class);
		
		boolean result = coach==alphacoach;
		System.out.println("Singleton object :"+result);
		
		System.out.println("Coach:"+coach);
		System.out.println("AplhaCoach:"+alphacoach);
		
		applicationContext.close();
	}

}
