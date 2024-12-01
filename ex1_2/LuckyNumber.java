import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        int sum = 0;
        int position = 1;

        while (number > 0) {
            int digit = number % 10;
            if (position % 2 == 0) {
                sum += digit * digit;
            }
            number /= 10;
            position++;
        }

        if (sum % 9 == 0) {
            System.out.println("The number is a lucky number.");
        } else {
            System.out.println("The number is not a lucky number.");
        }
        scanner.close();
    }
}