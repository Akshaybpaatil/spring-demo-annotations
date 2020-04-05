package com.practice.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = applicationContext.getBean("tennisCoach",Coach.class);
		System.out.println(coach.getDialyWorkout());
		
		System.out.println(coach.getDailyFortune());
		applicationContext.close();
	}

} 
