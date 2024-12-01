class Rectangle {
    private float length;
    private float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        double area = length * width;
        return Math.round(area * 100.0) / 100.0; // Rounding to 2 decimal places
    }

    public double calculatePerimeter() {
        double perimeter = 2 * (length + width);
        return Math.round(perimeter * 100.0) / 100.0; // Rounding to 2 decimal places
    }
}

public class Tester {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0f, 3.0f);
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
    }
}
