import java.util.Scanner;

public class OrderManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Order Type (DineIn / Takeout / Delivery): ");
        String orderType = sc.next();

        System.out.print("Enter Loyalty Status (None / Silver / Gold / Platinum): ");
        String loyalty = sc.next();

        System.out.print("Enter Order Size (number of items): ");
        int orderSize = sc.nextInt();

        System.out.print("Is it Peak Hour? (Yes / No): ");
        String peakHour = sc.next();

        double basePrice = orderSize * 150; 
        double discount = 0;
        String priority = "";
        if (orderType.equalsIgnoreCase("DineIn")) {
            if (orderSize > 10) {
                discount += 0.05;
            }
            priority = "Medium";
        }
        else if (orderType.equalsIgnoreCase("Takeout")) {
            if (orderSize > 5) {
                discount += 0.03;
            }
            priority = "High"; 
        }
        else if (orderType.equalsIgnoreCase("Delivery")) {
            basePrice += 40; 
            if (orderSize > 5) {
                discount += 0.02;
            }
            priority = "High";
        }
        else {
            System.out.println("Invalid Order Type!");
            return;
        }
        if (loyalty.equalsIgnoreCase("Silver")) {
            discount += 0.05;
        }
        else if (loyalty.equalsIgnoreCase("Gold")) {
            discount += 0.10;
        }
        else if (loyalty.equalsIgnoreCase("Platinum")) {
            discount += 0.15;
        }
        else if (!loyalty.equalsIgnoreCase("None")) {
            System.out.println("Invalid Loyalty Status!");
            return;
        }
        if (peakHour.equalsIgnoreCase("Yes")) {
            if (priority.equals("Medium")) {
                priority = "High"; 
            }
            basePrice += basePrice * 0.10; 
        }
        else if (!peakHour.equalsIgnoreCase("No")) {
            System.out.println("Invalid Peak Hour Input!");
            return;
        }

        double finalPrice = basePrice - (basePrice * discount);
        System.out.println("\n------------------------------------");
        System.out.println("Base Price: ₹" + basePrice);
        System.out.println("Total Discount: " + (discount * 100) + "%");
        System.out.println("FINAL PRICE: ₹" + finalPrice);
        System.out.println("KITCHEN PRIORITY: " + priority);
        System.out.println("------------------------------------");
    }
}