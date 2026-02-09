// Problem: Rotate array right by K positions
// Difficulty: Medium
// Pattern: Modulo + Array manipulation
// Date: Feb 7, 2026

import java.util.Scanner;

public class Problem12_RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter K (rotate by): ");
        int k = sc.nextInt();

        // Print original
        System.out.print("Original: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Rotate
        int[] newArr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            int newPos = (i + k) % arr.length;
            newArr[newPos] = arr[i];
        }

        // Print rotated
        System.out.print("Rotated: ");
        for(int i = 0; i < n; i++) {
            System.out.print(newArr[i] + " ");
        }

        sc.close();
    }
}
