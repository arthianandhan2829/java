import java.util.Scanner;
public class DigitalSignaltoggle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Signalvalue,toggleMask");
        int Signalvalue = sc.nextInt();
        int toggleMask = sc.nextInt();
        int toggledMask = (Signalvalue^toggleMask);
         System.out.println("Toggledsignal = "+toggledMask);
         sc.close();
    }

}
