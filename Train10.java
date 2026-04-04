import java.util.Scanner;
public class Train10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        while (k > 9) {  
            int sum = 0; 
            int n = k;

            while (n > 0) {
                int rem = n % 10;
                sum += rem;
                n /= 10;
            }

            k = sum; 
        }

        System.out.println(k); 
    }
}
        

