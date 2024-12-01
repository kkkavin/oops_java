import java.util.Scanner;

public class FoodOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter type of food (V/N):");
        char foodType = scanner.next().charAt(0);
        System.out.println("Enter the quantity:");
        int quantity = scanner.nextInt();
        System.out.println("Enter the distance:");
        int distance = scanner.nextInt();

        double costPerPlate = foodType == 'V' ? 12 : 15;
        double deliveryCharge = distance > 3 ? 1.5 * (distance - 3) : 0;
        double total = quantity * costPerPlate + deliveryCharge;

        if (foodType != 'V' && foodType != 'N' || quantity < 1 || distance <= 0) {
            total = -1;
        }

        System.out.println("Total Bill: $" + total);
        scanner.close();
    }
}