import java.util.Scanner;
public class Transportfee {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter distance,rateperkm,maintence,driverAllowance,subsidy:");
    int distance = sc.nextInt();
    int rateperkm = sc.nextInt();
    int maintenance = sc.nextInt();
    int driverAllowance = sc.nextInt();
    int  subsidy = sc.nextInt();
    int totalfee = (distance * rateperkm)+maintenance + driverAllowance-subsidy;
    System.out.println("Total Transport fee = "+totalfee);
    sc.close();
    }

}
