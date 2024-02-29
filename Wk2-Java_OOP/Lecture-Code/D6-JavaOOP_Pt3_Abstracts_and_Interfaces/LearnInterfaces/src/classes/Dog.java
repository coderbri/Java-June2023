package classes;

import interfaces.Animal;

public class Dog implements Animal {
//	* Attributes ----------------------------
	private String name;
	private int health;
	private int energy;
	
	
//	* Constructor ---------------------------
	public Dog() {
		this.name = "default name";
		this.health = 100;
		this.energy = 50;
	}
	
	public Dog(String name, int health, int energy) {
		this.name = name;
		this.health = health;
		this.energy = energy;
	}
	
	
//	* Methods -------------------------------
	
	public void sleep() {
		System.out.println("*zzZZzzzZZZ*... The dog curls up.");
	}

	public void eat() {
		System.out.println("*munch* *munch*... The dog is eating.");
		this.energy += 10;
	}
	
	public void showAffection() {
		System.out.println("*woof* *woof*... The dog loves you.");
	}
	
	
//	* Getters & Setters ---------------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}
}
