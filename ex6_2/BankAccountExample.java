class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money
    public synchronized void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited: %.2f, New Balance: %.2f%n", amount, balance);
        }
    }

    // Method to withdraw money
    public synchronized void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrew: %.2f, New Balance: %.2f%n", amount, balance);
        } else {
            System.out.printf("Withdrawal of %.2f failed, Insufficient funds: %.2f%n", amount, balance);
        }
    }

    // Method to get the current balance
    public synchronized double getBalance() {
        return balance;
    }
}

class DepositThread extends Thread {
    private final BankAccount account;
    private final double amount;

    public DepositThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.deposit(amount);
    }
}

class WithdrawThread extends Thread {
    private final BankAccount account;
    private final double amount;

    public WithdrawThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}

public class BankAccountExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00); // Initial balance of $1000

        // Creating deposit and withdraw threads
        Thread depositThread1 = new DepositThread(account, 200.00);
        Thread depositThread2 = new DepositThread(account, 300.00);
        Thread withdrawThread1 = new WithdrawThread(account, 150.00);
        Thread withdrawThread2 = new WithdrawThread(account, 500.00);
        Thread withdrawThread3 = new WithdrawThread(account, 800.00); // This should fail

        // Starting the threads
        depositThread1.start();
        depositThread2.start();
        withdrawThread1.start();
        withdrawThread2.start();
        withdrawThread3.start();

        // Wait for all threads to finish
        try {
            depositThread1.join();
            depositThread2.join();
            withdrawThread1.join();
            withdrawThread2.join();
            withdrawThread3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Final balance
        System.out.printf("Final Balance: %.2f%n", account.getBalance());
    }
}