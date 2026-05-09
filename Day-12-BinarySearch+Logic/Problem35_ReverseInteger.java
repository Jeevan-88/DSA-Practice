
// Problem 35: Reverse Integer
// LeetCode #7
// Pattern: Math/Logic
// Date: Apr 22, 2026 
import java.util.*;

public class Problem35_ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int n = sc.nextInt();

        long rev = 0;

        while (n != 0) {
            int pop = n % 10;
            n = n / 10;
            rev = (rev * 10) + pop;
        }

        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            System.out.println("Overflow");
            return;
        }

        System.out.println("reverse = " + rev);

    }
}
