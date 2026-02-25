// Problem: Maximum Sum Subarray of size K
// Difficulty: Easy
// Pattern: Sliding Window
// Date: Feb 19, 2026
import java.util.Scanner;
public class Problem24_MaxSumSubarray {
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
        int windowSum = 0;
        for(int i = 0;i<k;i++){
            windowSum += arr[i];
        }
        int maxSum = windowSum;
        for(int i = k;i<arr.length;i++){
            windowSum += arr[i] - arr[i-k];
            maxSum = Math.max(maxSum,windowSum);
        }
        System.out.println("Maximum sum of subarray of size " + k + ": " + maxSum);
    }
}
