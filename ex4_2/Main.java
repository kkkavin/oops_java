// Superclass
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

// Subclass
class Mammal extends Animal {
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass
class Dog extends Mammal {
    void bark() {
        System.out.println("Barking...");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        
        // Calling methods from the superclass and subclasses
        myDog.eat();   // Inherited from Animal
        myDog.sleep(); // Inherited from Mammal
        myDog.bark();  // Unique to Dog
    }
}