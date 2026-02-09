// Problem: Check if array is symmetric
// Difficulty: Easy
// Pattern: Two Pointers
// Date: Feb 8, 2026

import java.util.Scanner;

public class Problem13_CheckSymmetricArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values in array");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = arr.length-1;
        boolean isSymmetric = true;
        while(left<right){
            if(arr[left] != arr[right]){
                isSymmetric = false;
                break;
            }
            else{
                left++;
                right--;
            }
        }
        if(isSymmetric){
            System.out.println("Yes the array is symmetric");
        }
        else{
            System.out.println("The given array is not symmetric");
        }
        sc.close();
    }
}