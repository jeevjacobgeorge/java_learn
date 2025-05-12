package problems_set2;

public class m {
	public static void makeAnimalSound(Animal a) {
		a.makeSound();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stubC
		Dog d = new Dog("carnivorous");
		d.makeSound();
		makeAnimalSound(d);
	}

}