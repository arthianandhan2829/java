import java.util.Scanner;
public class train6{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for(int i=start;i<=end;i++){
        if(i%100!=0){
            if(i%4==0){
             System.out.println("Leap year");
            }
            else{
                System.out.println("Not a leap year");
            }
        }
        else{
             if(i %400==0){
            System.out.println("Leap year");        
        }  
          else{
            System.out.println("Not a leap year");
        }  
        }
    sc.close();
    }

    }
}