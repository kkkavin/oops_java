class Calculator {
    public double findAverage(int n1, int n2, int n3) {
        double average = (n1 + n2 + n3) / 3.0;
        return Math.round(average * 100.0) / 100.0; // Rounding to 2 decimal places
    }
}

public class Tester {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double result = calc.findAverage(10, 20, 30);
        System.out.println("The average is: " + result);
    }
}