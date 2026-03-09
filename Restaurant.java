import java.util.Scanner;
public class Restaurant {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Double totalBill,service,gst;
      int people;
      System.out.println("Enter totalBill:");
      totalBill = sc.nextDouble();
      System.out.println("Enter service percentage:");
      service = sc.nextDouble();
      System.out.println("Enter Gst percentage:");
      gst = sc.nextDouble();
      System.out.println("Enter number of people:");
      people = sc.nextInt();
      Double  serviceCharge = totalBill*service/100;
      Double subtotal = totalBill+serviceCharge;
      Double gstAmount =  subtotal*gst/100;
      Double finalBill = subtotal+gstAmount;
      Double perperson = finalBill/people;
      System.out.println("Amount per person = +perperson:");
    }
}
