import java.util.Scanner;
public class Securitypermission {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter permissionA,permissionB");
    int permissionA = sc.nextInt();
    int permissionB = sc.nextInt();
    int mergedpermission = (permissionA|permissionB);
    System.out.println("Mergedpermission code ="+mergedpermission);
    sc.close();
    }
}
