class User{
    private int id;
    private String userName;
    private String emailId;
    private double walletBalance;

    // Constructor
    public User(int id, String userName, String emailId, double walletBalance) {
        this.id = id;
        this.userName = userName;
        this.emailId = emailId;
        this.walletBalance = walletBalance;
    }

    // Make Payment Method
    public boolean makePayment(double billAmount) {
        if (billAmount <= walletBalance) {
            walletBalance -= billAmount;
            return true;
        }
        return false;
    }

    // Getter Methods
    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    // Setter Methods
    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }
}

class PremiumUser extends User{
    private double rewardPoints;

    // Constructor
    public PremiumUser(int id, String userName, String emailId, double walletBalance) {
        super(id, userName, emailId, walletBalance);
        this.rewardPoints = 0;
    }

    // Overridden makePayment Method
    @Override
    public boolean makePayment(double billAmount) {
        if (super.makePayment(billAmount)) {
            rewardPoints += billAmount * 0.1;
            return true;
        }
        return false;
    }

    // Getter Method
    public double getRewardPoints() {
        return rewardPoints;
    }
}

class Tester {

    public static void main(String[] args) {

        User user = new User(101, "Joe", "joe@abc.com", 100);

		PremiumUser premiumUser = new PremiumUser(201, "Jill", "jill@abc.com", 300);

		processPayment(user, 70);

		processPayment(premiumUser, 150);

		processPayment(premiumUser, 80);

		processPayment(premiumUser, 120);

    }

    public static void processPayment(User user, double billAmount) {
        if (user.makePayment(billAmount)) {
			System.out.println("Congratulations " + user.getUserName() + ", payment of $" + billAmount + " was successful!");
		} else {
			System.out.println("Sorry " + user.getUserName() + ", you do not have enough balance to pay the bill!");
		}
		System.out.println("Your wallet balance is $" + user.getWalletBalance());

		if (user instanceof PremiumUser) {
			PremiumUser premiumUser = (PremiumUser) user;
			System.out.println("You have " + premiumUser.getRewardPoints() + " points!");
		}
		System.out.println();
    }
}
