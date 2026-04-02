import java.util.Scanner;
public class  Train8{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
        for(int j=0;j<i;j++){
            System.out.print("  ");
        }
        for(int h=0;h<(2*(n-i)+1);h++){
            System.out.print("* ");
        }
        System.out.println();
        }
    }
}