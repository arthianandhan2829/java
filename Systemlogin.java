import java.util.Scanner;
public class Systemlogin {
    public  static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter usernameMatch,passwordmatch,accountlocked");
        int usernameMatch = sc.nextInt();
        int PasswordMatch = sc.nextInt();
        int accountlocked = sc.nextInt();
        if(usernameMatch==1 && PasswordMatch==1 && accountlocked==0){
            System.out.println("Login Success");
        }
        else{
            System.out.println("Login Failed");
        }
        sc.close();
    }
}
