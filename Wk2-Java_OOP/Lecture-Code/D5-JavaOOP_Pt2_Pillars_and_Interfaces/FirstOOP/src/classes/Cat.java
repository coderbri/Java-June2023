package classes;

public class Cat extends Animal {
	public static int catCount;
	
	public Cat() {
		super(); // this will inherit the parent Animal constructor
		this.energy = 40;
		/* To be able to use a class attribute from the main 
			Animal class, the attribute needs to be either set
		 	to protected or a getter needs to be used. */
		catCount++;
	}
	
	public void displayCatData() {
		super.displayAnimalData();
		System.out.printf("Total Cat Count: %s\n", catCount);
	}
	
	public void huntMice() {
		this.energy -= 10;
		System.out.printf("%s just hunted mice. %s energy remaining.\n", this.getName(), this.energy);
	}
}
