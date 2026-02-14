// Problem: Move all zeros to end
// Difficulty: Easy
// Pattern: Two Pointers (Slow & Fast)
// Date: Feb 11, 2026

import java.util.Scanner;

public class Problem16_MoveZeros {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:  ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
         for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
         }
         System.out.println("Original: ");
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
         }
         System.out.println();
         int slow = 0;
         for(int fast =0;fast<arr.length;fast++){
            if(arr[fast] != 0){
               int temp = arr[slow];
                  arr[slow] = arr[fast];
                  arr[fast] = temp;

                  slow++;
               
            }
         }
         System.out.println("After moving zeros: ");
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " "); }
             System.out.println();
         }


    }
   
