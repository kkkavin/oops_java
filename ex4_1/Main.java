// Superclass
class BasicPhone {
    void makeCall() {
        System.out.println("Making a call...");
    }

    void sendText() {
        System.out.println("Sending a text...");
    }
}

// Subclass
class Smartphone extends BasicPhone {
    void takePhoto() {
        System.out.println("Taking a photo...");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone();
        
        // Calling methods from the superclass and subclass
        myPhone.makeCall();   // Inherited from BasicPhone
        myPhone.sendText();   // Inherited from BasicPhone
        myPhone.takePhoto();  // Unique to Smartphone
    }
}