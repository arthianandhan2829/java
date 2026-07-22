import java.util.Scanner;
public class Char {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char n = sc.next().charAt(0);
        System.out.print(n);
        sc.close();
    }
}
