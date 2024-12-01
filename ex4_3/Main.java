// Superclass
class Vehicle {
    String brand;

    // Constructor to initialize the brand
    Vehicle(String brand) {
        this.brand = brand;
    }

    // Method to display the brand
    void display() {
        System.out.println("Brand: " + brand);
    }
}

// Subclass Car
class Car extends Vehicle {
    int numDoors;

    // Constructor to initialize brand and numDoors
    Car(String brand, int numDoors) {
        super(brand); // Call to Vehicle constructor
        this.numDoors = numDoors;
    }

    // Method to display car details
    @Override
    void display() {
        System.out.println("Car Brand: " + brand + ", Number of Doors: " + numDoors);
    }
}

// Subclass Motorcycle
class Motorcycle extends Vehicle {
    int engineCapacity;

    // Constructor to initialize brand and engineCapacity
    Motorcycle(String brand, int engineCapacity) {
        super(brand); // Call to Vehicle constructor
        this.engineCapacity = engineCapacity;
    }

    // Method to display motorcycle details
    @Override
    void display() {
        System.out.println("Motorcycle Brand: " + brand + ", Engine Capacity: " + engineCapacity + "cc");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", 4);
        myCar.display(); // Display car details

        // Create a Motorcycle object
        Motorcycle myMotorcycle = new Motorcycle("Yamaha", 600);
        myMotorcycle.display(); // Display motorcycle details
    }
}