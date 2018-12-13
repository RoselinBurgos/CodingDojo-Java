package com.codingdojo.ObjectMaster;

public class Wizard extends Human{
	
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
		
	}
	
	public void heal(Human target) {
		target.setHealth(target.getHealth() + this.getIntelligence());
		
	}

	public void fireball(Human target) {
		target.setHealth(target.getHealth() - (this.getIntelligence() * 3));
	}
		

}
