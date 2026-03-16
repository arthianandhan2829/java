import java.util.Scanner;

public class LoanScreeningSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input details
        System.out.print("Enter Credit Score: ");
        int creditScore = sc.nextInt();

        System.out.print("Enter Annual Income: ");
        double annualIncome = sc.nextDouble();

        System.out.print("Enter Debt Ratio: ");
        double debtRatio = sc.nextDouble();

        sc.nextLine(); // clear buffer

        System.out.print("Enter Loan Type (Personal/Home/Business): ");
        String loanType = sc.nextLine();

        String status;

        // Nested conditional logic
        if (creditScore >= 750 && debtRatio < 0.4) {

            if (loanType.equalsIgnoreCase("Business") && annualIncome < 100000) {
                status = "Needs Review";
            } 
            else {
                status = "Approved";
            }

        } 
        else if ((creditScore >= 650 && creditScore < 750) || 
                (debtRatio >= 0.4 && debtRatio <= 0.6)) {

            status = "Needs Review";
        } 
        else {
            status = "Rejected";
        }

        // Display result
        System.out.println("\n------ Loan Application Result ------");
        System.out.println("Credit Score: " + creditScore);
        System.out.println("Annual Income: $" + annualIncome);
        System.out.println("Debt Ratio: " + debtRatio);
        System.out.println("Loan Type: " + loanType);
        System.out.println("Application Status: " + status);

        sc.close();
    }
}