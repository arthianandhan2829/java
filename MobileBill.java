import java.util.Scanner;
public class MobileBill {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double baseCost,extraGB,ratePerGB,tax;
        System.out.println("Enter base cost:");
        baseCost = sc.nextDouble();
        System.out.println("Enter extra GB used:");
        extraGB = sc.nextDouble();
        System.out.println("Enter rate  per GB:");
        ratePerGB = sc.nextDouble();
        System.out.println("Enter tax percentage:");
        tax = sc.nextDouble();
        double extraCost = extraGB*ratePerGB;
        double total = baseCost+extraCost;
        double finalBill = total+(total*tax/100);
        System.out.println("TotalBill = + finalBill");


    }
}
