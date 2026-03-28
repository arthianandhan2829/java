import  java.util.Scanner;
public class Softwarecompany {
public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter hours,rate,design,testing,advance:");
   int hours = sc.nextInt();
   int rate = sc.nextInt();
   int design = sc.nextInt();
   int testing = sc .nextInt();
   int advance = sc.nextInt();
    int projectcost = (hours*rate)+design - testing - advance;
    System.out.println("Final Praoject cost = "+ projectcost);
    sc.close();
}
}
