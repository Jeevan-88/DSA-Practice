// Problem: Find all pairs with given sum
// Difficulty: Medium
// Pattern: Two Pointers (Start & End)
// Date: Feb 8, 2026

import java.util.Scanner;

public class Problem15_PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:  ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter SORTED elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        System.out.println("\nSearching for pairs...\n");
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("Pair found: (" + arr[left] + ", " + arr[right] + ")");
                count++;
                left++;
                right--; // Move BOTH pointers inward
            } else if (sum < target) {
                left++; // Sum too small, need bigger number
            } else {
                right--; // Sum too big, need smaller number (NOT right++!)
            }
        }
        if (count > 0) {
            System.out.println("Total pairs found = " + count);
        } else {
            System.out.println("No pairs found with sum = " + target);
        }
    }
}