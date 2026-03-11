import java.util.Scanner;
public class Employee {
    public  static void main(String[]args){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter Workinghours:");
    int Workinghours = sc.nextInt();
    System.out.println("Enter attedancepercentage:");
    int attedancepercentage = sc.nextInt();
    if(Workinghours>40&&attedancepercentage>90){
        System.out.println("Bonus Eligible");
    }  
    else{
        System.out.println("Not Eligible") ; 
    }
    sc.close();
    }
}
