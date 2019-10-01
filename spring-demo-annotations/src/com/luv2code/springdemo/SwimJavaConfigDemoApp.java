package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// read Spring Configuration java class

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from spring container

		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

		// call a method on a bean	

		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get the daily fortune
		
		System.out.println(theCoach.getDailyFortune());
		
		//call our new Swim coach method... Has the props value injected 
		
		System.out.println("email: " + theCoach.getEmail());
		System.out.println("team: " + theCoach.getTeam());

		// close the context
		
		context.close();

	}

}
