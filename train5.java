import java.util.Scanner;
public class train5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        if(N<=1){
            System.out.println(N+"is not a  prime number");
        }else{
        for(int i=2;i<=N/2;i++){
            if(N%i==0){
                count++;
            }
        }
        if(count ==0){
            System.out.println(N+"is a prime number");
        }else{
            System.out.println(N+"is not a prime number");
        }
}
sc.close();
    }
}