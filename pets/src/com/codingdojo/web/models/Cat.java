package com.codingdojo.web.models;

public class Cat extends Animal implements Pet {

	public Cat() {
		super();
		
	}

	public Cat(String name, String breed, int weight) {
		super(name, breed, weight);
		
	}

	@Override
	public String showAffection() {
		int weight = getWeight();
		String petName = getName();
		String response="";
		
		if (weight < 10  ) {
			response = (petName+" hopped into your lap and cuddled with you.");
		}
		
		if (weight > 10) {
			response = (petName+" looked at you and starts purring while rubbing up against your leg.");
		}
		
		return (response);
	}
	
	

}
