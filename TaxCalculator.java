import java.util.Scanner;

public class TaxCalculator {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Annual Revenue: ");
        double revenue = sc.nextDouble();

        System.out.print("Enter Business Type (Sole / Partnership / LLP / PvtLtd): ");
        String type = sc.next();

        System.out.print("Enter Deductible Expenses: ");
        double deductions = sc.nextDouble();

        System.out.print("Enter Tax Credits: ");
        double credits = sc.nextDouble();

        double taxRate = 0;
        double taxableIncome;
        double tax;
        if (revenue <= 1000000) {

            if (type.equalsIgnoreCase("Sole")) {
                taxRate = 0.05;
            } else if (type.equalsIgnoreCase("Partnership")) {
                taxRate = 0.10;
            } else if (type.equalsIgnoreCase("LLP")) {
                taxRate = 0.12;
            } else if (type.equalsIgnoreCase("PvtLtd")) {
                taxRate = 0.15;
            } else {
                System.out.println("Invalid Business Type!");
                return;
            }
        }
        else if (revenue <= 5000000) {

            if (type.equalsIgnoreCase("Sole")) {
                taxRate = 0.10;
            } else if (type.equalsIgnoreCase("Partnership")) {
                taxRate = 0.15;
            } else if (type.equalsIgnoreCase("LLP")) {
                taxRate = 0.18;
            } else if (type.equalsIgnoreCase("PvtLtd")) {
                taxRate = 0.22;
            } else {
                System.out.println("Invalid Business Type!");
                return;
            }
        }
        else {

            if (type.equalsIgnoreCase("Sole")) {
                taxRate = 0.15;
            } else if (type.equalsIgnoreCase("Partnership")) {
                taxRate = 0.20;
            } else if (type.equalsIgnoreCase("LLP")) {
                taxRate = 0.25;
            } else if (type.equalsIgnoreCase("PvtLtd")) {
                taxRate = 0.30;
            } else {
                System.out.println("Invalid Business Type!");
                return;
            }
        }

        taxableIncome = revenue - deductions - credits;

        if (taxableIncome < 0) {
            taxableIncome = 0; 
        }

        tax = taxableIncome * taxRate;
        System.out.println("\n-------------------------------");
        System.out.println("Applicable Tax Rate: " + (taxRate * 100) + "%");
        System.out.println("Taxable Income: ₹" + taxableIncome);
        System.out.println("Final Tax Liability: ₹" + tax);
        System.out.println("-------------------------------");
        sc.close();
    }
}