import java.util.Scanner;

public class RewardsCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Card Type (Silver/Gold/Platinum):");
        String cardType = sc.next();

        System.out.println("Enter Merchant Category (Travel, Dining, Grocery, Online, Other):");
        String category = sc.next();

        System.out.println("Enter Transaction Amount:");
        double amount = sc.nextDouble();

        System.out.println("Is it Promotional Period? (Yes/No):");
        String promo = sc.next();

        System.out.println("Cardholder Status (Regular/Premium):");
        String status = sc.next();

        double baseRate = 0;
        double categoryBonus = 0;
        double promoMultiplier = 1;
        double statusMultiplier = 1;
        if (cardType.equalsIgnoreCase("Silver")) {
            baseRate = 1; 
            if (category.equalsIgnoreCase("Travel")) categoryBonus = 1;
            else if (category.equalsIgnoreCase("Dining")) categoryBonus = 0.5;
            else categoryBonus = 0.2;

        } else if (cardType.equalsIgnoreCase("Gold")) {
            baseRate = 2;  
            if (category.equalsIgnoreCase("Travel")) categoryBonus = 2;
            else if (category.equalsIgnoreCase("Dining")) categoryBonus = 1;
            else if (category.equalsIgnoreCase("Online")) categoryBonus = 1.5;
            else categoryBonus = 0.5;

        } else if (cardType.equalsIgnoreCase("Platinum")) {
            baseRate = 3; 
            if (category.equalsIgnoreCase("Travel")) categoryBonus = 3;
            else if (category.equalsIgnoreCase("Dining")) categoryBonus = 2;
            else if (category.equalsIgnoreCase("Grocery")) categoryBonus = 1.5;
            else categoryBonus = 1;

        } else {
            System.out.println("Invalid Card Type.");
            return;
        }
        if (promo.equalsIgnoreCase("Yes")) {
            promoMultiplier = 1.5;  
        }
        if (status.equalsIgnoreCase("Premium")) {
            statusMultiplier = 1.2; 
        }

                double basePoints = (amount / 100) * baseRate;
        double bonusPoints = (amount / 100) * categoryBonus;
        double totalPoints = (basePoints + bonusPoints) * promoMultiplier * statusMultiplier;
        System.out.println("\n---- REWARDS SUMMARY ----");
        System.out.println("Card Type: " + cardType);
        System.out.println("Category: " + category);
        System.out.println("Transaction Amount: ₹" + amount);
        System.out.println("Base Points: " + basePoints);
        System.out.println("Category Bonus: " + bonusPoints);
        System.out.println("Promo Multiplier: " + promoMultiplier);
        System.out.println("Status Multiplier: " + statusMultiplier);
        System.out.println("Total Points Earned: " + totalPoints);
    }
}