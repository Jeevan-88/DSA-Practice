// Problem: Remove duplicates from sorted array
// Difficulty: Easy-Medium
// Pattern: Two Pointers (Slow & Fast)
// Date: Feb 8, 2026

import java.util.Scanner;

public class Problem14_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter SORTED elements:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        for(int j = 1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                System.out.println("Found unique element");
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.print("Unique elements: ");
        for(int k=0;k<=i;k++){
            System.out.print(arr[k] + " ");
        }
        System.out.println("Total unique elements: " + (i + 1));

        sc.close();
    }
}