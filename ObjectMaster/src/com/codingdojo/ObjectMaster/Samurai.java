package com.codingdojo.ObjectMaster;

public class Samurai extends Human{
	
	static int samuraiCount = 0;
	
	public Samurai() {
		this.health = 200;
		samuraiCount ++;
	}
	
	public void deathBlow(Human target) {
		target.setHealth(0);
		setHealth(this.getHealth()/2);
	}
	
	public void meditate(){
		setHealth((this.getHealth()/2) + this.getHealth());
		
	}
	

}
