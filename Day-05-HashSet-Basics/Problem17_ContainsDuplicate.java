// Problem: Check if array contains duplicate
// Difficulty: Easy
// Pattern: HashSet
// Date: Feb 13, 2026

import java.util.Scanner;
import java.util.HashSet;

public class Problem17_ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        HashSet<Integer> set = new HashSet<>();
        boolean hasDuplicate = false;
        
        for(int i = 0; i < arr.length; i++) {
            int currentNumber = arr[i];
            if(set.contains(currentNumber)){
                System.out.println("Has duplicate: "+currentNumber);
                hasDuplicate = true;
                break;
            }
            set.add(currentNumber);
            
        }
        
        if(hasDuplicate) {
            System.out.println("Contains duplicate: true");
        } else {
            System.out.println("Contains duplicate: false");
        }
        
        sc.close();
    }
}
