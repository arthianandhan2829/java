import java.util.Scanner;
public class Smarthome {
    public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter unitsconsumed,voltagefluctuation");
    int unitsconsumed = sc.nextInt();
    int voltagefluctuation = sc.nextInt();
    if(unitsconsumed>500||voltagefluctuation>=1){
      System.out.println("Alert Triggered");
    }
    else{
        System.out.println("Normalusage");
    }
    sc.close();
    }
}
