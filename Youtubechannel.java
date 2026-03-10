import java.util.Scanner;
public class Youtubechannel {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ads,sponsor,affilate,tax,production:");
        int ads = sc.nextInt();
        int sponsor = sc.nextInt();
        int affilate = sc.nextInt();
        int tax = sc.nextInt();
        int production = sc.nextInt();
        int income = ads+sponsor+affilate-tax-production;
        System.out.println("Final Youtube income="+income);
    }
}

