import java.util.Scanner;
public class Salary
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int basic,hra,bonus,tax,pf;
        int Salary;
        System.out.println("Enter basic salary:");
          basic = sc.nextInt();
        System.out.println("Enter hra:");
          hra = sc.nextInt();
        System.out.println("Enter bonus:");
          bonus = sc.nextInt();
        System.out.println("Enter tax:");
          tax = sc.nextInt();
        System.out.println("Enter pf:");
          pf = sc.nextInt();
        Salary = basic+hra+bonus-tax-pf;
        System.out.println("Take Home Salary ="+Salary);
    }
} 