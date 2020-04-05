package com.practice.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/*
	 * @Autowired public TennisCoach(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */
	
	public TennisCoach() {
		System.out.println(">>Inside Tennis Default Consructor");
	}
	
	//define my init method
	@PostConstruct
	public void doSomeOperation() {
		System.out.println(">>Tennis inside DosomeOperation method");
	}
	
	//define my destroy method
	@PreDestroy
	public void doSomeCleanUp() {
		System.out.println(">>Tennis inside DoSomeCleanUp");
	}
	
	
	/*
	 * @Autowired public void setFortuneService(FortuneService thefortuneService) {
	 * System.out.println(">>Inside Tennis Setter Mothod"); fortuneService =
	 * thefortuneService; }
	 */
	
	@Override
	public String getDialyWorkout() {
		return "Practice your beackand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
