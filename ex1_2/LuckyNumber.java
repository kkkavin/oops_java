import java.util.Scanner;

public class LuckyNumber {
    public static boolean isLuckyNumber(int n) {
        // Convert the number to a string to easily access digits by position
        String strN = Integer.toString(n);
        
        // Initialize sum of squares of even-positioned digits
        int sumOfSquares = 0;
        
        // Iterate through the digits in the number
        for (int i = 0; i < strN.length(); i++) {
            // Check if the position is even (i + 1 because index starts from 0)
            if ((i + 1) % 2 == 0) {
                int digit = Character.getNumericValue(strN.charAt(i));
                sumOfSquares += digit * digit;
            }
        }
        
        // Check if the sum of squares is a multiple of 9
        return sumOfSquares % 9 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isLuckyNumber(number)) {
            System.out.println(number + " is a lucky number.");
        } else {
            System.out.println(number + " is not a lucky number.");
        }
        
        scanner.close();
    }
}
