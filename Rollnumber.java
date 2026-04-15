import java.io.*;
import java.util.*;
public class Solution {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[]arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
       ArrayList<Integer>missing = new ArrayList<>();
        for(int i=0;i<N-1;i++){
            int current = arr[i];
             int next = arr[i+1];
            for(int num=current+1;num<next;num++){
                missing.add(num);
            }
        }
        for(int x: missing){
                System.out.print(x +"");
    }
}
}