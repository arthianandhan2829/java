import java.util.Scanner;
public class Warehousebox {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter baseboxes,levels");
        int baseboxes = sc.nextInt();
        int levels = sc.nextInt();
        int capacity = baseboxes<<levels;
        System.out.println("Total capacity="+capacity);
        sc.close();
    }
}
