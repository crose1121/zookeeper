package com.rose.zookeeper;

public class Mammal {
		
		//member variables
		protected int energyLevel;
		
		//constructor pointing to line 14 and passing in default energyLevel 100
		public Mammal() {
			this(100);
		}
		
		//overloaded constructor
		public Mammal(int energyLevel) {
			this.energyLevel = energyLevel;
		}

		//getter and setter 
		public int getEnergyLevel() {
			return energyLevel;
		}

		public void setEnergyLevel(int energyLevel) {
			this.energyLevel = energyLevel;
		}
		
		public int displayEnergy() {
			return this.getEnergyLevel();
		}
		

}
