package com.pappa.spring1;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "run 1km in min";
	}

	@Override
	public String getDailyFortune() {
		
		return "just do it: "+ fortuneService.getFortune();
	}
	
	//add an init method 
	public void doMyStartupStuff() {
		System.out.println("TrackCoach : inside method doMyStartupStuff");
		
	}
	//add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach : inside method doMyCleanupStuff");
	}

}
