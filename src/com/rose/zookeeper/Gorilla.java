package com.rose.zookeeper;

public class Gorilla extends Mammal{
	
	//constructors
	public Gorilla() {
		this(100);
	}
	
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	
	//methods
	public void throwSomething() {
		int currentEnergy = this.energyLevel;
		this.energyLevel -= 5;
		System.out.printf("\nThe gorilla just threw something! Energy level decreased from %s to %s.",currentEnergy,this.energyLevel);
	}
	
	public void eatBananas() {
		int currentEnergy = this.energyLevel;
		this.energyLevel += 10;
		System.out.printf("\nThe gorilla just ate a banana. He looks sated. Energy level increased from %s to %s.",currentEnergy,this.energyLevel);
	}
	
	public void climbTree() {
		int currentEnergy = this.energyLevel;
		this.energyLevel -= 10;
		System.out.printf("\nThe gorilla just climbed a tree. Energy level decreased from %s to %s", currentEnergy, this.energyLevel);
	}
}
