import java.util.Scanner;

// Custom exception for invalid Aadhar number
class InvalidAadharNumberException extends Exception {
    public InvalidAadharNumberException(String message) {
        super(message);
    }
}

// StudentDetails class to hold student information
class StudentDetails {
    private String registerNumber;
    private String name;
    private String mobileNumber;
    private String aadharNumber;
    private String passportNumber;

    // Constructor
    public StudentDetails(String registerNumber, String name, String mobileNumber, String aadharNumber, String passportNumber) {
        this.registerNumber = registerNumber;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.aadharNumber = aadharNumber;
        this.passportNumber = passportNumber;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Register Number: " + registerNumber);
        System.out.println("Name: " + name);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Aadhar Number: " + aadharNumber);
        System.out.println("Passport Number: " + passportNumber);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter Register Number: ");
            String registerNumber = scanner.nextLine();
            
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter Mobile Number: ");
            String mobileNumber = scanner.nextLine();
            
            System.out.print("Enter Aadhar Number (format: 1234 5678 9123): ");
            String aadharNumber = scanner.nextLine();
            validateAadharNumber(aadharNumber);  // Validate Aadhar number
            
            System.out.print("Enter Passport Number: ");
            String passportNumber = scanner.nextLine();
            
            // Create StudentDetails object if all inputs are valid
            StudentDetails student = new StudentDetails(registerNumber, name, mobileNumber, aadharNumber, passportNumber);
            System.out.println("\nStudent Details Submitted Successfully:");
            student.displayDetails();
            
        } catch (InvalidAadharNumberException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Method to validate Aadhar number
    public static void validateAadharNumber(String aadharNumber) throws InvalidAadharNumberException {
        if (!aadharNumber.matches("\\d{4} \\d{4} \\d{4}")) {
            throw new InvalidAadharNumberException("Invalid Aadhar Number. It must be in the format: 1234 5678 9123");
        }
    }
}