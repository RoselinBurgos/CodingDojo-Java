package com.codingdojo.zookeeper;

public class Mammal {
	
	protected int energyLevel = 100;

	public int displayEnergy() {
		return getEnergyLevel();
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	
}


