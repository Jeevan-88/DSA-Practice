
// Problem 30: Binary Search
// Difficulty: Easy
// Pattern: Binary Search
// Date: Mar 18, 2026
import java.util.Scanner;

public class Problem31_SearchInsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target element: ");
        int target = sc.nextInt();
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                System.out.println("Element found at index:" + mid);
                return;
            } else if (arr[mid] < target) {
                left = mid + 1;

            } else {
                right = mid - 1;
            }
        }
        System.out.println("Element to be inserted at index: " + left);
    }
}
