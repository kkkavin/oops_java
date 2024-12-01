// Applicant class to hold applicant details
class Applicant {
    private String name;
    private String email;
    private String phoneNumber;
    private String positionApplied;
    
    // Constructor
    public Applicant(String name, String email, String phoneNumber, String positionApplied) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.positionApplied = positionApplied;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPositionApplied() {
        return positionApplied;
    }

    // Method to display applicant details
    public void displayDetails() {
        System.out.println("Applicant Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Position Applied: " + positionApplied);
        System.out.println("====================================");
    }
}

// Main class to test the functionality
class RecruitmentSystem {
    public static void main(String[] args) {
        // Creating applicant objects
        Applicant applicant1 = new Applicant("John Doe", "john.doe@example.com", "1234567890", "Software Engineer");
        Applicant applicant2 = new Applicant("Jane Smith", "jane.smith@example.com", "0987654321", "Data Analyst");

        // Displaying applicant details
        System.out.println("Applicant Details:");
        System.out.println("***************");
        applicant1.displayDetails();
        applicant2.displayDetails();
        
        // You can create more applicant objects for testing
        Applicant applicant3 = new Applicant("Alice Johnson", "alice.johnson@example.com", "1122334455", "Project Manager");
        applicant3.displayDetails();
    }
}