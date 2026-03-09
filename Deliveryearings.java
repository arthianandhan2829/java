import java.util.Scanner; {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter deliveries,payoutDelivery,incentive,fuelcost:");
    int deliveries = sc.nextInt();
    int payout = sc.nextInt();
    int incentive = sc.nextInt();
    int fuelcost = sc.nextInt();
    int netearings = (deliveries*payout)+ incentive-fuelcost;
    System.out.println("Driver Earings = "+ netearings);
    }
}
 
