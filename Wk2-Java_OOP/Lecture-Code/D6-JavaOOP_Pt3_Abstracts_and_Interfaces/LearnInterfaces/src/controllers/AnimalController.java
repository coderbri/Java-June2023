package controllers;

import classes.Cat;
import classes.Dog;

public class AnimalController {
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.eat();
		System.out.println(cat.getEnergy());
		
		Dog dog = new Dog();
		dog.showAffection();
	}
}
