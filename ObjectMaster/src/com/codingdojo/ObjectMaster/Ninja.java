package com.codingdojo.ObjectMaster;

public class Ninja extends Human {
	
	public Ninja() {
		this.stealth = 10;
		
	}
	
	public void steal(Human target) {
		target.setHealth(target.getHealth() - this.getStealth());
		setHealth(this.getHealth() + this.getStealth());
	}
	
	public void runaway(){
		setHealth(this.getHealth() - 10);
	}

}
