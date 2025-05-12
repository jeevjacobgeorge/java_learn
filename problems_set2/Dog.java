package problems_set2;

public class Dog extends Animal {
	public Dog() {}
	public Dog(String species) {
		super(species);
	}
	@Override
	public void makeSound() {
		System.out.println("Bow Bow");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
