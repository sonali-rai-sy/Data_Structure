package overwrite;


class animal{
	void eat(){
		System.out.println("Eating");
	}
}

class dog extends animal{
	@Override
	void eat() {
		
		System.out.println("I am only enating");
	}
	
}

public class Write {
	public static void main(String args[]) {
	
	dog d=new dog();
	d.eat();
	

}
}
