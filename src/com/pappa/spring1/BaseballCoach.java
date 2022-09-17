package com.pappa.spring1;

public class BaseballCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define constructor for dependency injection
	public BaseballCoach (FortuneService theFortuneService) {
		fortuneService= theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortunService to get fortune
		
		return fortuneService.getFortune();
	}

}
