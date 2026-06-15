package dog;

class Animal {

    void eat() {
        System.out.println("Eating..");
    }
}

class DogAnimal extends Animal {

    void bark() {
        System.out.println("Barking");
    }
}

public class Dog {

    public static void main(String[] args) {

        DogAnimal d = new DogAnimal();
        d.eat();
        d.bark();
    }
}