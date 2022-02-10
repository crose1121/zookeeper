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
	}

}
