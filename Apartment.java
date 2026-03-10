import java.util.Scanner;
public class Apartment {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter maintenance,parking,hall,security,electricity,cleaning:");
    int maintenance = sc.nextInt();
    int parking = sc.nextInt();
    int hall = sc.nextInt();
    int security = sc.nextInt();
    int electricity = sc.nextInt();
    int cleaning = sc.nextInt();
    int maintenancecollection = maintenance+parking+hall-security-electricity-cleaning;
    System.out.println("Remaining balance ="+maintenancecollection); 
    }
    
}
