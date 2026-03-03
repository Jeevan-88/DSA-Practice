// Next Greater Element
// Given an array, print the Next Greater Element (NGE) for every element. The Next greater Element for an element x is the first greater element on the right side of x in array. Elements for which no greater element exist, consider next greater element as -1.
// Difficulty: Medium
// Pattern: Stack
// Date: 3rd March 2026
import java.util.Scanner;
public class Problem29_NextGreaterElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<arr.length;i++){
            int nextGreater = -1;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    nextGreater = arr[j];
                    break;
                }
               
                
            }
             
                    System.out.println("Next greater element for "  +arr[i]+ " is " + nextGreater);
        }
    }
}