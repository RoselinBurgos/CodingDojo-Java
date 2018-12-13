package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {
	
	public void throwsomething() {
		System.out.println("Gorilla threw something");
		int threwSomething = getEnergyLevel();
		threwSomething -= 5;
		
		setEnergyLevel(threwSomething);
		
	}
	
	public void eatBananas() {
		System.out.println("Gorilla ate a Banana");
		int ateSomething = getEnergyLevel();
		ateSomething += 10;
		
		setEnergyLevel(ateSomething);
	}
	
	public void climb() {
		System.out.println("Gorilla is climbing");
		int climbUp = getEnergyLevel();
		climbUp -= 10;
		
		setEnergyLevel (climbUp);
		
	}
	
	

	
}
