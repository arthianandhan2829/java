public class ParkingFeeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Location Zone (A / B / C): ");
        String zone = sc.next();

        System.out.print("Enter Time of Day (Peak / OffPeak): ");
        String time = sc.next();

        System.out.print("Enter Vehicle Type (Small / Medium / Large): ");
        String vehicle = sc.next();

        System.out.print("Enter Duration (in hours): ");
        int hours = sc.nextInt();

        System.out.print("Membership (None / Silver / Gold): ");
        String membership = sc.next();

        double baseRate = 0;
        double vehicleRate = 0;
        double peakCharge = 0;
        double discount = 0;
        if (zone.equalsIgnoreCase("A")) {
            baseRate = 50; 
        } else if (zone.equalsIgnoreCase("B")) {
            baseRate = 40;
        } else if (zone.equalsIgnoreCase("C")) {
            baseRate = 30;
        } else {
            System.out.println("Invalid Zone!");
            return;
        }
        if (vehicle.equalsIgnoreCase("Small")) {
            vehicleRate = 5;
        } else if (vehicle.equalsIgnoreCase("Medium")) {
            vehicleRate = 10;
        } else if (vehicle.equalsIgnoreCase("Large")) {
            vehicleRate = 20;
        } else {
            System.out.println("Invalid Vehicle Type!");
            return;
        }
        if (time.equalsIgnoreCase("Peak")) {
            peakCharge = 20;
        } else if (time.equalsIgnoreCase("OffPeak")) {
            peakCharge = 0;
        } else {
            System.out.println("Invalid Time Input!");
            return;
        }
        if (membership.equalsIgnoreCase("Silver")) {
            discount = 0.10; 
        } else if (membership.equalsIgnoreCase("Gold")) {
            discount = 0.20; 
        } else if (!membership.equalsIgnoreCase("None")) {
            System.out.println("Invalid Membership Type!");
            return;
        }

        double hourlyRate = baseRate + vehicleRate + peakCharge;
        double totalFee = hourlyRate * hours;
        totalFee = totalFee - (totalFee * discount);
        System.out.println("\n-------------------------------------------");
        System.out.println("Hourly Rate: ₹" + hourlyRate);
        System.out.println("Total Fee Before Discount: ₹" + (hourlyRate * hours));
        System.out.println("Membership Discount: " + (discount * 100) + "%");
        System.out.println("FINAL PARKING FEE: ₹" + totalFee);
        System.out.println("-------------------------------------------");
    }
}
