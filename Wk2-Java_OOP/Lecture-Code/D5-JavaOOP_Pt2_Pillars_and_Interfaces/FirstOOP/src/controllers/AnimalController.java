package controllers;

// import the class needed to be able to create object instances
import classes.Animal;
import classes.Cat;
import classes.Dog;

public class AnimalController {
	public static void main(String[] args) {
		
		// ? Instantiate a new Animal Object
		Animal animalOne = new Animal();
		System.out.println(animalOne.getColor()); // >> default color
		animalOne.setColor("tri-colored");
		System.out.println(animalOne.getColor()); // >> tri-colored
		System.out.printf("Animal Count: %d\n", Animal.getAnimalCount());
		
		Animal myPet = new Animal("classic brown tabby", 1.5, 13, "Loki");
		System.out.println(myPet.getColor());
		System.out.printf("Animal Count: %d\n", Animal.getAnimalCount());
		
//		D5
		Cat neko = new Cat();
		System.out.println(neko.getName()); // >> default name
		neko.setName("Neko-Chan");
		System.out.println(neko.getName()); // >> Neko-Chan
		neko.getEnergy();
		
		animalOne.displayAnimalData();
		myPet.displayAnimalData();
		
		neko.displayCatData();
		neko.huntMice();
		
		Dog buddy = new Dog();
		buddy.setName("Buddy");
		buddy.setColor("golden");
		buddy.displayDogData();
		buddy.run();
		
//		neko.huntMice();
//		neko.huntMice();
//		neko.huntMice();
		
		neko.eatTreats();
		neko.eatTreats();
		neko.eatTreats();
		
		neko.jump();
		neko.eatTreats();
		neko.eatTreats();
		
		buddy.eatTreats();
	}
	
}
