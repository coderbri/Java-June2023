package classes;

import interfaces.Animal;

public class Cat implements Animal {
//	* Attributes ----------------------------
	private String name;
	private int health;
	private int energy;
	
	
//	* Constructor ---------------------------
	public Cat() {
		this.name = "default name";
		this.health = 900;
		this.energy = 30;
	}
	
	public Cat(String name, int health, int energy) {
		this.name = name;
		this.health = health;
		this.energy = energy;
	}
	
	
//	* Methods -------------------------------
	@Override
	public void sleep() {
		System.out.println("*zzZZzzzZZZ*... The cat curls up.");
	}
	
	@Override
	public void eat() {
		System.out.println("*munch* *munch*... The cat is eating.");
		this.energy += 10;
	}
	
	@Override
	public void showAffection() {
		System.out.println("*meow*... The cat loves you");
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
