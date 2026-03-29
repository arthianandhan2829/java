import java.util.Scanner;
public class Cinemaprofit {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ticketrevenue,snackrevenue,maintencecost,electricitybill:");
        int ticketrevenue = sc.nextInt();
        int snackrevenue = sc.nextInt();
        int maintencecost = sc.nextInt();
        int electricitybill = sc.nextInt();
        int netprofit = ticketrevenue+snackrevenue-maintencecost-electricitybill;
        System.out.println("Net profit =" + netprofit);
        sc.close();
    
    
    }
}
