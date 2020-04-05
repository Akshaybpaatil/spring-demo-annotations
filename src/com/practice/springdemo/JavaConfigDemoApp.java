package com.practice.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach coach = applicationContext.getBean("tennisCoach",Coach.class);
		
		System.out.println(coach.getDialyWorkout());
		
		System.out.println(coach.getDailyFortune());
		applicationContext.close();
	}

} 
