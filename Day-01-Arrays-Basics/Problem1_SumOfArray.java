// Problem: Find sum of all elements in an array
// Difficulty: Easy
// Date: Feb 5, 2026

import java.util.Scanner;

public class Problem1_SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum = " + sum);
        sc.close();
    }
}