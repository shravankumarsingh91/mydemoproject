package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an arrray of string

	private String[] data = { "Beware of the wolf in sheep's clothing", "Diligence is the mother of good luck",
			"The Journey is the reward"

	};

	// create a Random number generator

	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		// pick a random String from the array
		
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
