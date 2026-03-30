import java.util.Scanner;
public class Train2{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        float cgpa = sc.nextFloat();
        char grade = sc.next().charAt(0);

        int ans = (int)(cgpa * 100);
        cgpa = (float)ans/100;

        System.out.println("Name:"+ name );
        System.out.println("Age:" + age);
        System.out.println("CGPA:"+cgpa);
        System.out.println("Grade:"+grade);
        sc.close();
    } 
}
