import java.util.Scanner;
public class Railwayticket {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter genpass,genfare,acpass,acfare,platform,maintenance,fuel:");
    int genpass= sc.nextInt();
    int  genfare = sc.nextInt();
    int acpass = sc.nextInt();
    int acfare = sc.nextInt();
    int platform = sc.nextInt();
    int maintenance = sc.nextInt();
    int fuel = sc.nextInt();
    int revenue = (genpass*genfare)+(acpass*acfare)+platform-maintenance-fuel;
    System.out.println("Net Railway Revenue ="+ revenue);
    sc.close();
    }
    }