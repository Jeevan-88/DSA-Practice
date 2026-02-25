
// Given an array of integers and a number K, find the first negative integer for each and every contiguous subarray of size K. If a subarray does not contain a negative integer, then print 0 for that subarray.
// Difficulty: Easy 
// Pattern: Sliding Window
// Date: Feb 21, 2026
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Problem27_FirstNegativeInWindow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
          for(int i = 0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
        System.out.println("Enter the size of subarray for sliding window: ");
        int k = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i < k ;i++){
            if(arr[i]< 0){
                q.offer(arr[i]);
            }
        }
        
        if(q.isEmpty()) System.out.print("0 ");
        else System.out.print(q.peek() + " ");

        for(int i = k;i<arr.length;i++){
           
            if(arr[i] < 0) {q.offer(arr[i]);}
            if(!q.isEmpty() && q.peek() == arr[i-k]) {q.poll();}
            if(q.isEmpty()) {System.out.print("0 ");}
            else {System.out.print(q.peek() + " ");}
        }
        
    }
}
