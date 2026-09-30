import java.util.Scanner;
public class Average {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        float sum=0;
        for(int i=1;i<=n;i++){
            int k =sc.nextInt();
            sum=sum+k;
        }
        System.out.printf("%.2f",sum/n);
    }
}
