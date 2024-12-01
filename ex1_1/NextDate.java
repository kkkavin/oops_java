import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day:");
        int day = scanner.nextInt();
        System.out.println("Enter month:");
        int month = scanner.nextInt();
        System.out.println("Enter year:");
        int year = scanner.nextInt();

        // Logic to calculate the next date
        if (day < 28) {
            day++;
        } else if (day == 28) {
            if (month == 2 && (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0))) {
                day = 1;
                month++;
            } else {
                day++;
            }
        } else if (day == 29) {
            if (month == 2) {
                day = 1;
                month++;
            } else {
                day++;
            }
        } else if (day == 30) {
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                day = 1;
                month++;
            } else {
                day++;
            }
        } else if (day == 31) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
        System.out.printf("Next Date: %d-%d-%d", day, month, year);
        scanner.close();
    }
}