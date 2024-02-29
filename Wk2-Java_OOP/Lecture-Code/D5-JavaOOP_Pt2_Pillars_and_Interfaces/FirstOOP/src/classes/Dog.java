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
		if (this.energy <= 0) {
			this.setAlive(false);
			System.out.printf("Cannot run for %s has died...\n", this.getName());
			dogCount--;
		} else if (this.energy <= 10) {
			System.out.printf("%s is too tired to run (Energy Level: %s). Feed now!\n", this.getName(), this.energy);
		} else {
			this.energy -= 25;
			System.out.printf("%s just ran. %s energy remaining.\n", this.getName(), this.energy);
		}
	}
}
