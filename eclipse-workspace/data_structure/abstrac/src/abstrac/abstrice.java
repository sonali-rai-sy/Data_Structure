package abstrac;

abstract class Animal{
	abstract void sound();
	void eat() {
		System.out.println("Eating");
		
	}
	
	
}
class Dog extends Animal{
	void sound() {
		System.out.println("Barking...");
		
	}
	
}

public class abstrice {
	
	public static void main(String srgs[]) {
		
		Dog d=new Dog();
		d.sound();
		d.eat();
		
		
	}
	

}
