import java.util.Scanner;

public class ScholarshipEligibilitySystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter GPA:");
        double gpa = sc.nextDouble();

        System.out.println("Enter Family Income:");
        double income = sc.nextDouble();

        System.out.println("Enter Extracurricular / Sports Score:");
        int extraScore = sc.nextInt();

        System.out.println("Enter Scholarship Type (merit / need / sports):");
        String type = sc.next();

        String decision = "Rejected";
        double amount = 0;
        if (type.equalsIgnoreCase("merit")) {

            if (gpa >= 3.8) {
                decision = "Approved";
                amount = 50000;
            } else if (gpa >= 3.5) {
                decision = "Approved";
                amount = 30000;
            }

        } else if (type.equalsIgnoreCase("need")) {

            if (income < 500000) {
                decision = "Approved";
                amount = 60000;
            } else if (income < 1000000) {
                decision = "Approved";
                amount = 30000;
            }

        } else if (type.equalsIgnoreCase("sports")) {

            if (extraScore >= 85) {
                decision = "Approved";
                amount = 40000;
            } else if (extraScore >= 70) {
                decision = "Approved";
                amount = 20000;
            }
        }
        System.out.println("Decision: " + decision);
        System.out.println("Scholarship Amount: ₹" + amount);
        sc.close();
    }
}