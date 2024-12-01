interface Tax {
    double calculateTax(double price);
    double getTaxPercentage();
}

class PurchaseDetails implements Tax {
    private String purchaseId;
    private String paymentType;
    private double taxPercentage;

    public PurchaseDetails(String purchaseId, String paymentType) {
        this.purchaseId = purchaseId;
        this.paymentType = paymentType;
    }

    @Override
    public double calculateTax(double price) {
        // Assuming a fixed tax percentage for purchases
        taxPercentage = 10.0; // 10% tax
        double taxAmount = price * (taxPercentage / 100);
        return price + taxAmount; // Total amount including tax
    }

    @Override
    public double getTaxPercentage() {
        return taxPercentage;
    }
}

class Seller implements Tax {
    private String location;
    private double taxPercentage;

    public Seller(String location) {
        this.location = location;
    }

    @Override
    public double calculateTax(double price) {
        // Tax percentage based on location
        if ("Canada".equalsIgnoreCase(location)) {
            taxPercentage = 5.0; // 5% tax for Canada
        } else if ("USA".equalsIgnoreCase(location)) {
            taxPercentage = 7.0; // 7% tax for USA
        } else {
            taxPercentage = 10.0; // Default tax percentage
        }
        return price * (taxPercentage / 100); // Return tax amount
    }

    @Override
    public double getTaxPercentage() {
        return taxPercentage;
    }
}

class Tester {
    public static void main(String args[]) {
        System.out.println("Purchase Details\n***************");
        PurchaseDetails purchaseDetails = new PurchaseDetails("P1001", "Credit Card");
        System.out.println("Total purchase amount: " + Math.round(purchaseDetails.calculateTax(100) * 100) / 100.0);
        System.out.println("Tax percentage: " + purchaseDetails.getTaxPercentage());

        System.out.println("\nSeller Details\n***************");
        Seller seller = new Seller("Canada");
        System.out.println("Tax to be paid by the seller (Canada): " + Math.round(seller.calculateTax(100) * 100) / 100.0);
        System.out.println("Tax percentage: " + seller.getTaxPercentage());

        // Create more objects for testing your code
        Seller sellerUSA = new Seller("USA");
        System.out.println("\nTax to be paid by the seller (USA): " + Math.round(sellerUSA.calculateTax(100) * 100) / 100.0);
        System.out.println("Tax percentage: " + sellerUSA.getTaxPercentage());
    }
}