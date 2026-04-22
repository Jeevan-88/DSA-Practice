import java.util.*;
// Problem 33: Sqrt(x)
// LeetCode #69
// Pattern: Binary Search (Find Floor Value)
// Date: Apr 22, 2026
public class Problem33_SqrtX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        
        int left = 0;
        int right = x;
        while(left<=right){
            int mid = left + (right  - left)/2;
            if((long)mid * mid == x){
                System.out.println("Square root of " + x + " is " + mid);
                return;
            }
            else if((long)mid * mid > x){
                right = mid - 1;
            }
            else{
                left = mid +1;
            }
        }
        System.out.println("Square root of " + x + " is " + right);
        
    }
}
