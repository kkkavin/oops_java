import java.util.HashMap;
import java.util.Map;

// Custom class to demonstrate storing different types in HashMap
class MyOwnClass {
    private String name;

    public MyOwnClass(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyOwnClass{name='" + name + "'}";
    }
}

public class HashMapExample {
    private Map<String, Object> myMap;

    public HashMapExample() {
        myMap = new HashMap<>();
    }

    // Method to check if a key exists, update or add a new entry
    public void updateOrAddEntry(String key, Object value) {
        if (myMap.containsKey(key)) {
            System.out.println("Key '" + key + "' exists. Updating value.");
            myMap.put(key, value);
        } else {
            System.out.println("Key '" + key + "' does not exist. Adding new entry.");
            myMap.put(key, value);
        }
    }

    // Method to display the contents of the HashMap
    public void displayMap() {
        System.out.println("Current contents of the HashMap:");
        for (Map.Entry<String, Object> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        HashMapExample example = new HashMapExample();

        // Adding different types of objects to the HashMap
        example.updateOrAddEntry("stringKey", "Hello, World!");
        example.updateOrAddEntry("myOwnClassKey", new MyOwnClass("Example Object"));
        example.updateOrAddEntry("integerKey", 42);

        // Display the contents of the HashMap
        example.displayMap();

        // Updating existing entries
        example.updateOrAddEntry("stringKey", "Updated String");
        example.updateOrAddEntry("integerKey", 100);

        // Display the contents of the HashMap after updates
        example.displayMap();
    }
}