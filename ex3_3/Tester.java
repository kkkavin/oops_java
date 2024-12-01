class Rectangle {
    private float length;
    private float breadth;

    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return Math.round((this.length * this.breadth) * 100.0) / 100.0;
    }

    public double calculatePerimeter() {
        return Math.round((2 * (this.length + this.breadth)) * 100.0) / 100.0;
    }

    public void displayDimensions() {
        System.out.println("Length: " + this.length);
        System.out.println("Breadth: " + this.breadth);
    }
}

public class Tester {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(4.5f, 2.0f);
        rect.displayDimensions();
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
    }
}