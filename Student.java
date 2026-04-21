import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[]arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int K = sc.nextInt();
        int left = 0,right = N-1;
        int count=0;
        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum==K){
                count++;
                left++;
                right--;
            }
            else if(sum<K){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println(count);
    }
}