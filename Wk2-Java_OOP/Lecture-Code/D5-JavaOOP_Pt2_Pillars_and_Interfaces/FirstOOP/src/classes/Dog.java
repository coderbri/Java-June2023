package classes;

public class Dog extends Animal {
	public static int dogCount;
	
	public Dog() {
		super();
		this.energy = 50;
		dogCount++;
	}
	
	public void displayDogData() {
		super.displayAnimalData();
		System.out.printf("Total Dog Count: %s\n", dogCount);
	}
	
	public void run() {
		this.energy -= 25;
		System.out.printf("%s just ran. %s energy remaining.\n", this.getName(), this.energy);
	}
}
