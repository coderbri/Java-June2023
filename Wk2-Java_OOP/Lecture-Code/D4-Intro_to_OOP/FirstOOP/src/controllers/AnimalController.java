package controllers;

import classes.Animal; // import the class needed to be able to create object instances

public class AnimalController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ? Instantiate a new Animal Object
		Animal animalOne = new Animal();
		System.out.println(animalOne.getColor()); // >> default color
		
		animalOne.setColor("tri-colored");
		System.out.println(animalOne.getColor()); // >> tri-colored
		System.out.printf("Animal Count: %d\n", Animal.getAnimalCount());
		
		Animal myPet = new Animal("classic brown tabby", 1.5, 13, "Loki");
		System.out.println(myPet.getColor());
		System.out.printf("Animal Count: %d\n", Animal.getAnimalCount());
	}

}
