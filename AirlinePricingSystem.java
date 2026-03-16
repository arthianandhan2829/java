import java.util.Scanner;

public class AirlinePricingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base Ticket Price:");
        double basePrice = sc.nextDouble();

        System.out.println("Enter Booking Class (economy / business / first):");
        String bookingClass = sc.next();

        System.out.println("Enter Days Until Departure:");
        int days = sc.nextInt();

        System.out.println("Enter Seat Availability Percentage:");
        double seatAvailability = sc.nextDouble();

        System.out.println("Enter Route Popularity (low / medium / high):");
        String popularity = sc.next();

        double finalPrice = basePrice;
        if (bookingClass.equalsIgnoreCase("economy")) {
            finalPrice += basePrice * 0.10;     
        } else if (bookingClass.equalsIgnoreCase("business")) {
            finalPrice += basePrice * 0.40;     
        } else if (bookingClass.equalsIgnoreCase("first")) {
            finalPrice += basePrice * 0.80;     
        }
        if (days > 30) {
            finalPrice -= basePrice * 0.05;     
        } else if (days >= 10) {
            finalPrice += basePrice * 0.10;     
        } else {
            finalPrice += basePrice * 0.25;    
        }
        if (seatAvailability > 70) {
            finalPrice -= basePrice * 0.05;     
        } else if (seatAvailability >= 40) {
            finalPrice += basePrice * 0.10;     
        } else {
            finalPrice += basePrice * 0.20;     
        }
        if (popularity.equalsIgnoreCase("high")) {
            finalPrice += basePrice * 0.30;
        } else if (popularity.equalsIgnoreCase("medium")) {
            finalPrice += basePrice * 0.10;
        } else if (popularity.equalsIgnoreCase("low")) {
            finalPrice -= basePrice * 0.05;
        }
        System.out.println("\nFinal Dynamic Ticket Price: ₹" + finalPrice);
        sc.close();
    }
}