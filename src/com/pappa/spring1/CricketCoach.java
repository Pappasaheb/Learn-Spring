package com.pappa.spring1;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//new fields added
	private String emailAddress;
	private String team;
	
	
	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg costructor");
	}
	
	
	//our setter method
	public void setFortuneService(FortuneService fortuneService) { 
		System.out.println("Cricket: inside setter method - setFortuneService ");
		this.fortuneService = fortuneService;
	}

	//new setter and getter methods
	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket: inside setter method - setEmailAddress ");
		this.emailAddress=emailAddress;
	}
	public void setTeam(String team) {
		System.out.println("Cricket: inside setter method - setTeam ");
		this.team=team;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getTeam() {
		return team;
	}


	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
