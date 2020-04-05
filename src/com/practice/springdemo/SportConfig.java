package com.practice.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.practice.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	// define bean for our sad fortune Service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// Define Bean for Coach Service
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
