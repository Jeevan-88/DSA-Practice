// Problem 32: First Bad Version
// LeetCode #278
// Pattern: Binary Search (Find First Occurrence)
// Date: Apr 1, 2026

    import java.util.Scanner;

public class Problem32_FirstBadVersion {

    // Simulating isBadVersion
    static int firstBad = 4; // change this to test

    static boolean isBadVersion(int version) {
        return version >= firstBad;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total versions (n): ");
        int n = sc.nextInt();
        System.out.print("Enter first bad version: ");
        firstBad = sc.nextInt();

        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println("First bad version = " + left);
        sc.close();
    }
}