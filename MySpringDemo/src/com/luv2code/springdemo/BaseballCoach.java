package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	//dependency injection

	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
	}
	
	public BaseballCoach() {
		
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getFortune() {
		// use my fortune service
		return  fortuneService.getFortune(); 
	}

}








