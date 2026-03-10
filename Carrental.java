import java.util.Scanner;
public class Carrental {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter days,rent,late,fuel,maintenance:");
        int days = sc.nextInt();
        int rent = sc.nextInt();
        int late = sc.nextInt();
        int fuel = sc.nextInt();
        int maintenance = sc.nextInt();
        int profit=(days*rent)+late-fuel-maintenance;
        System.out.println("Net profit = "+profit);

    }

    
}
