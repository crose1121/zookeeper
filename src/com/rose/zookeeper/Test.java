package com.rose.zookeeper;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammal mammal1 = new Mammal();
		Gorilla gorilla1 = new Gorilla();
		
//		System.out.println(mammal1.displayEnergy());
		System.out.println(gorilla1.displayEnergy());
		gorilla1.throwSomething();
		
		gorilla1.eatBananas();
		
		gorilla1.climbTree();
		
		Bat bat1 = new Bat();
		
		bat1.fly();
		bat1.eatHumans();
		bat1.attackTown();
		
		//why do i have to displayEnergy 1 extra time for it to print??????????
		System.out.println(bat1.displayEnergy());
		System.out.println(gorilla1.displayEnergy());
		System.out.println(gorilla1.displayEnergy());
	}

}
