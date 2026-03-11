import java.util.Scanner;
public class Onlineexam {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter theoryMarks:");
    int theoryMarks = sc.nextInt();
    System.out.println("Enter practicalMarks:");
    int  practicalMarks = sc.nextInt();
    double average = (theoryMarks+practicalMarks)/2.0;
    if(theoryMarks>=50&&practicalMarks>=50&&average>=60){
       System.out.println("Pass");
    }
    else{
        System.out.println("Fail");
    }
    sc.close();
    }
}
