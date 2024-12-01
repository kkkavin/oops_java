import java.io.*;

// Define the BankAccount class
class BankAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    private int accountNumber;
    private String accountHolder;
    private transient double balance; // Marked as transient

    // Constructor
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getters and toString() for display
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount(12345, "John Doe", 10000.50);

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bankaccount.ser"))) {
            System.out.println("Before Serialization: " + account);
            oos.writeObject(account);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bankaccount.ser"))) {
            BankAccount deserializedAccount = (BankAccount) ois.readObject();
            System.out.println("After Deserialization: " + deserializedAccount);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
