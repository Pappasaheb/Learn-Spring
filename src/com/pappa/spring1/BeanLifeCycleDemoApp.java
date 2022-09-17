package com.pappa.spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("com/pappa/spring1/beanLifeCycle-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach=context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		/*
		Coach alphaCoach=context.getBean("myCoach",Coach.class);
		
		//check if they are the same?
		boolean result=(theCoach==alphaCoach);
		
		//print the result
		System.out.println("both objects are same = "+result);
		System.out.println("memory location of theCoach = "+theCoach);
		System.out.println("memory locaion of alphaCoach = "+alphaCoach);
		
		*/
		
		//close the context
		context.close();
	}

}
