package com.pappa.spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//load the spring configurartion file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("com/pappa/spring1/applicationContext.xml");
		
		//retrieve bean from spring container
		CricketCoach theCoach= context.getBean("myCricketCoach", CricketCoach.class);
		
		//call methods
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//call new methods
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		//close the context
		context.close();
				
	}

}
