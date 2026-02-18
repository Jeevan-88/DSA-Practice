// Problem: Two Sum - Practice from Memory
// Date: Feb 17, 2026
// Challenge: Write this WITHOUT looking at old code!

import java.util.Scanner;
import java.util.HashMap;
public class Problem21_TwoSumReview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();
        
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                int oldIndex = map.get(complement);
                int currentIndex = i;
                System.out.println("Pair Found: ");
                System.out.println("Indices: (" + oldIndex + " , " + currentIndex + ")");
                System.out.println("Values: (" + arr[oldIndex] + " , " + arr[currentIndex] + ") = " + target);
                sc.close();
                return;  // Stop after finding the pair
            }
            map.put(arr[i],i);
        }
        
        System.out.println("No pair found");
        sc.close();
    }
}
