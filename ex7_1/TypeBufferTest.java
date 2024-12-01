import java.util.ArrayList;
import java.util.List;

class TypeBuffer<T> {
    private final List<T> buffer;
    private final int capacity;

    // Constructor to initialize the buffer with a specific capacity
    public TypeBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new ArrayList<>(capacity);
    }

    // Method to add an element to the buffer
    public boolean add(T element) {
        if (buffer.size() < capacity) {
            buffer.add(element);
            System.out.println("Added: " + element);
            return true;
        } else {
            System.out.println("Buffer is full. Cannot add: " + element);
            return false;
        }
    }

    // Method to remove an element from the buffer
    public T remove() {
        if (!buffer.isEmpty()) {
            T element = buffer.remove(buffer.size() - 1);
            System.out.println("Removed: " + element);
            return element;
        } else {
            System.out.println("Buffer is empty. Cannot remove element.");
            return null;
        }
    }

    // Method to check if the buffer is full
    public boolean isFull() {
        return buffer.size() == capacity;
    }

    // Method to check if the buffer is empty
    public boolean isEmpty() {
        return buffer.isEmpty();
    }

    // Method to get the current size of the buffer
    public int size() {
        return buffer.size();
    }

    // Method to get the capacity of the buffer
    public int getCapacity() {
        return capacity;
    }
}

public class TypeBufferTest {
    public static void main(String[] args) {
        // Test with Integer type
        TypeBuffer<Integer> intBuffer = new TypeBuffer<>(3);
        intBuffer.add(1);
        intBuffer.add(2);
        intBuffer.add(3);
        intBuffer.add(4); // Should indicate buffer is full
        intBuffer.remove();
        intBuffer.add(4); // Should succeed now
        System.out.println("Current size: " + intBuffer.size());
        System.out.println("Is Full: " + intBuffer.isFull());
        System.out.println("Is Empty: " + intBuffer.isEmpty());

        // Test with String type
        TypeBuffer<String> stringBuffer = new TypeBuffer<>(2);
        stringBuffer.add("Hello");
        stringBuffer.add("World");
        stringBuffer.add("!"); // Should indicate buffer is full
        stringBuffer.remove();
        stringBuffer.add("!"); // Should succeed now
        System.out.println("Current size: " + stringBuffer.size());
        System.out.println("Is Full: " + stringBuffer.isFull());
        System.out.println("Is Empty: " + stringBuffer.isEmpty());
    }
}