import java.util.Scanner;
public class Scholarship {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double tution,Scholarship,examfee,libraryfee;
        System.out.println("Enter tution fees:");
        tution = sc.nextDouble();
        System.out.println("Enter Scholarship:");
        Scholarship = sc.nextDouble();
        System.out.println("Enter examfee:");
        examfee = sc.nextDouble();
        System.out.println("Enter libraryfee");
        libraryfee = sc.nextDouble();
        Double ScholarshipAmount = tution*Scholarship/100;
        Double finalfee = tution-ScholarshipAmount+examfee+libraryfee;
        System.out.println("Final payable Fee = "+finalfee);
        sc.close();
    }
}

