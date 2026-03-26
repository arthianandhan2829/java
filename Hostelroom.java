import java.util.Scanner;
public class Hostelroom {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter rooms,price,servicecharges,commision:");
    int rooms = sc.nextInt();
    int price = sc.nextInt();
    int servicecharges = sc.nextInt();
    int commision = sc.nextInt();
    int revenue = (rooms*price)+servicecharges - commision;
    System.out.println("Total Revenue = " + revenue);
    sc.close();
    }

}
