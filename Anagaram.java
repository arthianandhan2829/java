import java.io.*;
import java.util.*;
public class Solution {
public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s =  sc.nextLine();
        String t = sc.nextLine();
        if(s.length()!=t.length()){
            System.out.println("false");
            return;
        }
        char[]a = s.toCharArray();
        char[]b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
          System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}