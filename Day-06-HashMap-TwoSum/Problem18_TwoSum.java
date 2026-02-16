// Problem: Find two numbers that add up to target
// Difficulty: Easy (but very important!)
// Pattern: HashMap
// Date: Feb 14, 2026
import java.util.Scanner;
import java.util.HashMap;

public class Problem18_TwoSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0;i<arr.length;i++){
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
                System.out.println("\nPair found:");
                System.out.println("Indices: (" + oldIndex + ", " + currentIndex + ")");
                System.out.println("Values: (" + arr[oldIndex] + ", " + arr[currentIndex] + ") = " + target);
                return;
            }
            map.put(arr[i],i);
        }
        System.out.println("\nNo pair found");
        }
    }

