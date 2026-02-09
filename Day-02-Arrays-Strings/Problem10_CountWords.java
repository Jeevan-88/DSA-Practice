// Problem: Count words in a string
// Difficulty: Easy
// Date: Feb 6, 2026

import java.util.Scanner;

public class Problem10_CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String[] words = s.trim().split("\\s+");

        if(s.trim().isEmpty()) {
            System.out.println("Words = 0");
        } else {
            System.out.println("Words = " + words.length);
        }

        sc.close();
    }
}