import java.util.Scanner;
public class GovernmentScholarship {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
    System.out.println("Enter familyincome,percentage");
    int familyincome = sc.nextInt();
    int percentage = sc.nextInt();
    if(familyincome<20000&&percentage>=75){
        System.out.println("Scholarship granted");
    }
    else{
        System.out.println("Not Granted");
    }
    sc.close();

    }    
    }
