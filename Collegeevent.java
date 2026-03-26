import java.util.Scanner;
public class Collegeevent {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter registration,sponsorship,stall,stage,celebrity,");
    int registration = sc.nextInt();
    int sponsorship = sc.nextInt();
    int stall = sc.nextInt();
    int stage = sc.nextInt();
    int celebrity = sc.nextInt();
    int remainingfund = registration+sponsorship+stall-stage-celebrity;
      System.out.println("Remainingfund = "+remainingfund);
      sc.close();
    }
}
