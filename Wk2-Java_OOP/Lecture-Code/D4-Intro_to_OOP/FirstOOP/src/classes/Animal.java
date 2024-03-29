package classes;

public class Animal {
	
//	 * Member Variables / Class Attributes
	private String color;
	private double height;
	private int weight;
	private String name;
	static int animalCount;
	
//	* Create a constructor for an Animal Object
//	? This is what the Animal Object in the Controller
//		will invoke upon creation.
//	? Default Animal Constructor (for when nothing is specified):
	public Animal() {
		this.color = "default color";
		this.height = 0.0;
		this.weight = 0;
		this.name = "default name";
		animalCount++;
	}
	
//	Animal Constructor to specify each field
	public Animal( String color, double height, int weight, String name) {
		this.color = color;
		this.height = height;
		this.weight = weight;
		this.name = name;
		animalCount++;
	}
	
//	* Getters & Setters
//	? For the AnimalControler to be able to retrieve attributes
//		of the Animal class, Getter & Setters are needed.
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public static int getAnimalCount() {
		return animalCount;
	}

	public static void setAnimalCount(int animalCount) {
		Animal.animalCount = animalCount;
	}
}
