import java.util.Scanner;

public class InsurancePremiumCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Driver Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Vehicle Type (Sedan / SUV / Sports / Truck): ");
        String vehicleType = sc.next();

        System.out.print("Enter Driving Record (Clean / Minor / Major): ");
        String record = sc.next();

        System.out.print("Enter Coverage Level (Basic / Standard / Full): ");
        String coverage = sc.next();

        double basePremium = 5000; 
        double riskFactor = 1.0;
        if (age < 18) {
            System.out.println("Invalid age for insurance!");
            return;
        } else if (age <= 25) {
            riskFactor += 0.30;
        } else if (age <= 40) {
            riskFactor += 0.10;
        } else if (age <= 60) {
            riskFactor += 0.05;
        } else {
            riskFactor += 0.20;
        }
        if (vehicleType.equalsIgnoreCase("Sedan")) {
            riskFactor += 0.05;
        } else if (vehicleType.equalsIgnoreCase("SUV")) {
            riskFactor += 0.10;
        } else if (vehicleType.equalsIgnoreCase("Sports")) {
            riskFactor += 0.25;
        } else if (vehicleType.equalsIgnoreCase("Truck")) {
            riskFactor += 0.15;
        } else {
            System.out.println("Invalid Vehicle Type!");
            return;
        }
        if (record.equalsIgnoreCase("Clean")) {
            riskFactor -= 0.05;
        } else if (record.equalsIgnoreCase("Minor")) {
            riskFactor += 0.15;
        } else if (record.equalsIgnoreCase("Major")) {
            riskFactor += 0.40;
        } else {
            System.out.println("Invalid Driving Record!");
            return;
        }
        if (coverage.equalsIgnoreCase("Basic")) {
            riskFactor += 0.00;
        } else if (coverage.equalsIgnoreCase("Standard")) {
            riskFactor += 0.20;
        } else if (coverage.equalsIgnoreCase("Full")) {
            riskFactor += 0.40;
        } else {
            System.out.println("Invalid Coverage Level!");
            return;
        }

        double finalPremium = basePremium * riskFactor;
        System.out.println("\n-------------------------------------");
        System.out.println("Base Premium: ₹" + basePremium);
        System.out.println("Risk Factor: " + riskFactor);
        System.out.println("Final Insurance Premium: ₹" + finalPremium);
        System.out.println("-------------------------------------");
    }
}