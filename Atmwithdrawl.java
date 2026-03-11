import java.util.Scanner;
public class Atmwithdrawl {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter accountbalance:");
    int accountbalance = sc.nextInt();
    System.out.println("Enter withdrawlAmount:");
    int withdrawlAmount = sc.nextInt();
    System.out.println("Enter dailylimit:");
    int dailylimit = sc.nextInt();
    if(withdrawlAmount<=accountbalance&&withdrawlAmount<=dailylimit){
    System.out.println("Transaction Approved");
    }
    else{
        System.out.println("Transaction Declined");
    }
    sc.close();
}
}