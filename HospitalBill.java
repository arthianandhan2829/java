import java.util.Scanner;
public class HospitalBill {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roomchargeperday,days,medicinecost,labfees,insurancecoverage:");
        int roomcharge =  sc.nextInt();    
        int days =  sc.nextInt();
        int medicinecost= sc. nextInt();
        int labfees=sc.nextInt();
        int insurancecoverage= sc.nextInt();
        int payableAmount = (roomcharge*days)+medicinecost+labfees-insurancecoverage;
        System.out.println("payableAmount = "+payableAmount);
        sc.close();
    }

    
}
