package com.codingdojo.ObjectMaster;

public class HumanTest {

	public static void main(String[] args) {
		Human H1 = new Human();
		Human H2 = new Human();
		
		
			H1.attack(H2);
			System.out.println("Attacked by a Human! The victims Health is: " + H2.getHealth());
		
		
		Wizard W1 = new Wizard();
		
			W1.heal(H2);
			System.out.println("Healed by the wizard! The Humans Health is now: " + H2.getHealth());
		
			W1.fireball(H2);
			System.out.println("Hit By the Wizard's firball! The victims Health is now: "+ H2.getHealth());
		
		Ninja N1 = new Ninja();
		
			N1.steal(H2);
			System.out.println("Stealth stealer! The victims Health is now: "+ H2.getHealth() + " Ninja's Health: " + N1.getHealth());
		
			N1.runaway();
			System.out.println("The Ninja is running away! Ninja's Health is now: " + N1.getHealth());
			
		Samurai S1 = new Samurai();
		Samurai S2 = new Samurai();
		Samurai S3 = new Samurai();
		
			S1.deathBlow(H2);
			System.out.println("Death by blow! The victim is now dead. Health: " + H2.getHealth());
			System.out.println("The Samurai's Health is now: " + S1.getHealth());
			
			S1.meditate();
			System.out.println("The Samurai is Meditating. Health is now: " + S1.getHealth());
			
			System.out.println("There are " + Samurai.samuraiCount + " Samurai");
		
		
		
		
	}
	
	
	


}
