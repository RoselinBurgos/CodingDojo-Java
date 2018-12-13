package com.codingdojo.zookeeper;

public class ZooKeeperTest {

	public static void main(String[] args) {
		
		Gorilla g1 = new Gorilla();
			
			g1.throwsomething();
			System.out.println(g1.displayEnergy());
			
			g1.eatBananas();
			System.out.println(g1.displayEnergy());
			
			g1.climb();
			System.out.println(g1.displayEnergy());
			
		
		Bat b1 = new Bat();
		
			b1.flying();
			System.out.println(b1.displayEnergy());
			
			b1.eatHumans();
			System.out.print(b1.displayEnergy());
			
			b1.attackTown();
			System.out.print(b1.displayEnergy());
			
			

	}

}
