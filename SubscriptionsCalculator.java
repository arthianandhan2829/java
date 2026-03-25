import java.util.Scanner;

public class SubscriptionCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Storage Capacity Needed (GB):");
        int storage = sc.nextInt();

        System.out.println("Enter Number of Users:");
        int users = sc.nextInt();

        System.out.println("Enter Backup Frequency (Daily/Weekly/Monthly):");
        String backup = sc.next();

        System.out.println("Select Support Level (Basic/Standard/Premium):");
        String support = sc.next();

        System.out.println("Annual Commitment? (Yes/No):");
        String annual = sc.next();

        double basePrice = 0;
        double userCost = 0;
        double backupCost = 0;
        double supportCost = 0;
        double discount = 0;
        if (storage <= 100) {
            basePrice = 5;     
        } else if (storage <= 500) {
            basePrice = 15;
        } else if (storage <= 1000) {
            basePrice = 25;
        } else {
            basePrice = 50;    
        }
        if (users <= 3) {
            userCost = 0;  
        } else if (users <= 10) {
            userCost = (users - 3) * 1; 
        } else if (users <= 50) {
            userCost = (users - 3) * 0.8;
        } else {
            userCost = (users - 3) * 0.5; 
        }
        if (backup.equalsIgnoreCase("Daily")) {
            backupCost = 10;
        } else if (backup.equalsIgnoreCase("Weekly")) {
            backupCost = 5;
        } else if (backup.equalsIgnoreCase("Monthly")) {
            backupCost = 2;
        } else {
            System.out.println("Invalid Backup Option");
            return;
        }
        if (support.equalsIgnoreCase("Basic")) {
            supportCost = 0;
        } else if (support.equalsIgnoreCase("Standard")) {
            supportCost = 10;
        } else if (support.equalsIgnoreCase("Premium")) {
            supportCost = 25;
        } else {
            System.out.println("Invalid Support Level");
            return;
        }
        if (annual.equalsIgnoreCase("Yes")) {
            discount = 0.15;  
        }
        double monthlyTotal = basePrice + userCost + backupCost + supportCost;
        double discountedTotal = monthlyTotal - (monthlyTotal * discount);
        String recommendedPlan = "";

        if (storage > 1000 || users > 50) {
            recommendedPlan = "Enterprise Plan";
        } else if (storage > 500 || users > 10) {
            recommendedPlan = "Business Plan";
        } else {
            recommendedPlan = "Personal Plan";
        }
        System.out.println("\n------ SUBSCRIPTION SUMMARY ------");
        System.out.println("Base Price: $" + basePrice);
        System.out.println("User Cost: $" + userCost);
        System.out.println("Backup Cost: $" + backupCost);
        System.out.println("Support Cost: $" + supportCost);
        System.out.println("Annual Discount: " + (discount * 100) + "%");
        System.out.println("Final Monthly Price: $" + discountedTotal);
        System.out.println("Recommended Plan: " + recommendedPlan);
    }
}
