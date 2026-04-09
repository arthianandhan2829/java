import java.util.Scanner;
public class Factoryproductioncalculator {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter roomchargeperday:");
    int roomchargeperday = sc.nextInt();
    System.out.println("Enter days:");
    int days = sc.nextInt();
    System.out.println("Enter medicinecost:");
    int medicinecost = sc.nextInt();
    System.out.println("Enter labfees:");
    int labfees = sc.nextInt();
    System.out.println("Enter insurancecverarg:");
    int insurancecverarg = sc.nextInt();
    int usablerods=(roomchargeperday*days)+medicinecost-labfees-insurancecverarg;
    System.out.println("UsableRods ="+ usablerods);
    sc.close();
    }
}


