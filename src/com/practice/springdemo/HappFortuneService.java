package com.practice.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a lucky day";
	}

}
