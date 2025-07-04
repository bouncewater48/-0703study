package methodOverride01;

public class Main {
	public static void main(String[] args) {
		Animal ani = new Animal();
		ani.name = "달이";
		ani.sound();
		
		Dog dog = new Dog();
		dog.name = "달이";
		dog.sound();
		  
		Cat cat = new Cat();
		cat.name = "별이";
		cat.sound();
	}
}
