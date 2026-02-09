// Problem: Reverse a string
// Difficulty: Easy
// Date: Feb 6, 2026

import java.util.Scanner;

public class Problem6_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.print("Reversed: ");
        for(int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }

        sc.close();
    }
}