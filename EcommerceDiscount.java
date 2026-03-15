
import java.util.Scanner;

public class EcommerceDiscount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String loyalty = sc.nextLine();
        double cartValue = sc.nextDouble();
        sc.nextLine();
        String category = sc.nextLine();
        String membership = sc.nextLine();

        int baseDiscount = 0;
        int additionalDiscount = 0;

        if (loyalty.equalsIgnoreCase("Bronze")) baseDiscount = 5;
        else if (loyalty.equalsIgnoreCase("Silver")) baseDiscount = 8;
        else if (loyalty.equalsIgnoreCase("Gold")) baseDiscount = 12;
        else if (loyalty.equalsIgnoreCase("Platinum")) baseDiscount = 15;

        if (cartValue >= 2000) additionalDiscount += 7;
        else if (cartValue >= 1000) additionalDiscount += 5;
        else if (cartValue >= 500) additionalDiscount += 3;

        if (category.equalsIgnoreCase("Electronics") && membership.equalsIgnoreCase("Prime")) {
            additionalDiscount += 5;
        }
        else if (category.equalsIgnoreCase("Fashion")) {
            additionalDiscount += 3;
        }
        else if (category.equalsIgnoreCase("Books") && membership.equalsIgnoreCase("Prime")) {
            additionalDiscount += 5;
        }
        else if (category.equalsIgnoreCase("Groceries") && cartValue > 300) {
            additionalDiscount += 2;
        }

        int totalDiscount = baseDiscount + additionalDiscount;

        double finalPrice = cartValue * (1 - totalDiscount / 100.0);
        double savings = cartValue - finalPrice;

        System.out.println("Loyalty Tier: " + loyalty);
        System.out.println("Cart Value: $" + cartValue);
        System.out.println("Product Category: " + category);
        System.out.println("Membership: " + membership);
        System.out.println("Base Discount: " + baseDiscount + "%");
        System.out.println("Additional Discount: " + additionalDiscount + "%");
        System.out.println("Total Discount: " + totalDiscount + "%");
        System.out.println("Final Price: $" + finalPrice);
        System.out.println("Savings: $" + savings);

        sc.close();
    }
}