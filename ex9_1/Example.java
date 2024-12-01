public class Example {
    // Public method
    public void publicMethod() {
        System.out.println("This is a public method.");
    }
    // Private method
    private void privateMethod() {
        System.out.println("This is a private method.");
    }
    // Protected method
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }
    // Method to demonstrate access to private method within the same class
    public void accessPrivateMethod() {
        privateMethod();
    }
    public static void main(String[] args) {
        Example example = new Example();
    }
}