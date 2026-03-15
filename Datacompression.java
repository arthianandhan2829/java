import java.util.Scanner;
public class Datacompression {
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter filesize,compressionscycle");
     int filesize = sc.nextInt();
     int compressionscycle = sc.nextInt();
     int size=filesize>>compressionscycle;
     System.out.println("Compressed Size="+size);
     sc.close();
    }
}
