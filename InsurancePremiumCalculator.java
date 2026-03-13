import java.util.Scanner;

public class InsurancePremiumCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        sc.nextLine();
        String smoking = sc.nextLine();
        String preExisting = sc.nextLine();
        String tier = sc.nextLine();

        double basePremium = 0;
        double surcharge = 0;

        if (tier.equalsIgnoreCase("Basic")) {

            if (age <= 30) basePremium = 200;
            else if (age <= 50) basePremium = 250;
            else if (age <= 65) basePremium = 350;
            else basePremium = 400;

        } 
        else if (tier.equalsIgnoreCase("Standard")) {

            if (age <= 30) basePremium = 300;
            else if (age <= 50) basePremium = 350;
            else if (age <= 65) basePremium = 450;
            else basePremium = 550;

        } 
        else if (tier.equalsIgnoreCase("Premium")) {

            if (age <= 30) basePremium = 500;
            else if (age <= 50) basePremium = 600;
            else if (age <= 65) basePremium = 700;
            else basePremium = 800;
        }

        if (smoking.equalsIgnoreCase("Smoker") && preExisting.equalsIgnoreCase("Yes")) {
            surcharge = basePremium * 0.70;
        }
        else if (smoking.equalsIgnoreCase("Smoker")) {
            surcharge = basePremium * 0.40;
        }
        else if (preExisting.equalsIgnoreCase("Yes")) {
            surcharge = basePremium * 0.30;
        }

        double total = basePremium + surcharge;

        System.out.println("Age: " + age);
        System.out.println("Smoking Status: " + smoking);
        System.out.println("Pre-existing Conditions: " + preExisting);
        System.out.println("Coverage Tier: " + tier);
        System.out.println("Base Premium: $" + basePremium);
        System.out.println("Risk Surcharge: $" + surcharge);
        System.out.println("Total Monthly Premium: $" + total);

        sc.close();
    }
}