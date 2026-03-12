import java.util.Scanner;
public class Smartelectricity {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter applicationvalue,appliancemask");
    int connectionvalue = sc.nextInt();
    int appliancemask = sc.nextInt();
    int result = connectionvalue & appliancemask;
    if(result==appliancemask){
        System.out.println("Appliance Active");
    }
    else{
        System.out.println("Inactive");
    }
    sc.close();
    }
}
