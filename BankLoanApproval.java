
import java.util.Scanner;

public class BankLoanApproval {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int creditScore = sc.nextInt();
        double income = sc.nextDouble();
        double debtRatio = sc.nextDouble();
        sc.nextLine();
        String loanType = sc.nextLine();

        String decision;
        double maxLoan = 0;

        if (creditScore < 600 || debtRatio > 50) {
            decision = "Rejected";
            maxLoan = 0;
        } 
        else {

            if (loanType.equalsIgnoreCase("Home")) {

                if (creditScore >= 750 && debtRatio <= 30) {
                    decision = "Approved";
                    maxLoan = income * 4;
                }
                else if (creditScore >= 700 && creditScore < 750 && debtRatio <= 40) {
                    decision = "Needs Review";
                    maxLoan = income * 3;
                }
                else {
                    decision = "Needs Review";
                    maxLoan = income * 3;
                }

            } 
            else if (loanType.equalsIgnoreCase("Personal")) {

                if (creditScore >= 750 && debtRatio <= 30) {
                    decision = "Approved";
                    maxLoan = income * 1;
                }
                else if (creditScore >= 650 && creditScore < 700 && debtRatio <= 40) {
                    decision = "Needs Review";
                    maxLoan = income * 0.5;
                }
                else {
                    decision = "Needs Review";
                    maxLoan = income * 0.5;
                }

            } 
            else if (loanType.equalsIgnoreCase("Business")) {

                if (creditScore >= 700 && debtRatio <= 40) {
                    decision = "Approved";
                    maxLoan = income * 3;
                }
                else {
                    decision = "Needs Review";
                    maxLoan = income * 3;
                }
            } 
            else {
                decision = "Rejected";
                maxLoan = 0;
            }
        }

        System.out.println("Credit Score: " + creditScore);
        System.out.println("Annual Income: $" + income);
        System.out.println("Debt-to-Income Ratio: " + debtRatio + "%");
        System.out.println("Loan Type: " + loanType);
        System.out.println("Decision: " + decision);
        System.out.println("Maximum Loan Amount: $" + maxLoan);

        sc.close();
    }
}