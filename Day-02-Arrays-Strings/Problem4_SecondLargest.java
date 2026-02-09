// Problem: Find second largest element in array
// Difficulty: Easy-Medium
// Date: Feb 6, 2026

import java.util.Scanner;

public class Problem4_SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int secondLargest = -1;

        for(int i = 1; i < n; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if(secondLargest == -1) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second Largest = " + secondLargest);
        }

        sc.close();
    }
}