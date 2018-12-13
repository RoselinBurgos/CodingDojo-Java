package com.codingdojo.ObjectMaster;

public class Human {
	
	protected int strength = 3;
	protected int intelligence = 3;
	protected int stealth = 3;
	protected int health = 100;
	
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	} 
	
	public void attack(Human target) {
		target.setHealth(target.getHealth() - this.getStrength());
		// Targets health (Person being attacked) is their health - the attackers strength 
		
	}
	
	

	

}
