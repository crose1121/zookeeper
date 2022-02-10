package com.rose.zookeeper;

public class Bat extends Mammal{
	
	//constructor
	public Bat() {
		this(300);
	}
	//loaded constructor
	public Bat(int energyLevel) {
		super(energyLevel);
	}
	
	//methods
	public void fly() {
		int currentEnergy = this.energyLevel;
		this.energyLevel -= 50;
		System.out.printf("\nflap-flap-flap-flap-flap-whooooooooooooosh! Energy level decreased from %s to %s.",currentEnergy,this.energyLevel);
	}
	
	public void eatHumans() {
		int currentEnergy = this.energyLevel;
		this.energyLevel += 25;
		System.out.printf("\ncrunch, crunch, crunch, slurp, chomp chomp. Energy level increased from %s to %s.",currentEnergy,this.energyLevel);
	}
	
	public void attackTown() {
		int currentEnergy = this.energyLevel;
		this.energyLevel -= 100;
		System.out.printf("\n'burning and crackling' ahhhhhh! we're all gonna die!! Energy level increased from %s to %s.",currentEnergy,this.energyLevel);
	}
}
