import java.util.Scanner;
public class train3{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
      float a1  = sc.nextFloat();
      float a2 = sc.nextFloat();
    System.out.println("Square root at first number:" + Math.sqrt(a1));
     System.out.println("First number raised to power of second number:"+Math.pow(a1,a2));
     sc.close();
}   
}