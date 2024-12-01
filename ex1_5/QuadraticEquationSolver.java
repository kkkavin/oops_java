import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coefficient a:");
        double a = scanner.nextDouble();
        System.out.println("Enter coefficient b:");
        double b = scanner.nextDouble();
        System.out.println("Enter coefficient c:");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;
        double root1, root2;

        if (discriminant > 0) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are real and distinct.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            root1 = -b / (2 * a);
            System.out.println("The roots are real and equal.");
            System.out.println("Root: " + root1);
        } else {
            System.out.println("The equation has no real roots.");
        }
        scanner.close();
    }
}