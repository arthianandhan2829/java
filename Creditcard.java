import java.util.Scanner;
public class Creditcard {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter creditlimit,purchaseAmount,cardblocked:");
        int creditlimit = sc.nextInt();
        int purchaseAmount = sc.nextInt();
        int cardblocked = sc.nextInt();
        if(purchaseAmount<=creditlimit&&cardblocked==0){
         System.out.println("Approved");
        }
        else{
            System.out.println("Declined");
        }
        sc.close();

        }
    }
    
