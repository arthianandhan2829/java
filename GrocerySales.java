import java.util.Scanner;
public class GrocerySales {
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     double sales,discount,get;
    System.out.println("Enter total sales:");
    sales = sc.nextDouble();
    System.out.println("Enter Discount percentage:");
    discount = sc.nextDouble();
    System.out.println("Enter  GST percentage:");
    get = sc.nextDouble();
    double  discountAmount = sales*discount/100;
    double afterDiscount = sales-discountAmount;
    double getAmount = afterDiscount*get/100;
    double finalRevenue = afterDiscount *getAmount;
    System.out.println("Final Revenue = + finalRevenue");
    }
}
