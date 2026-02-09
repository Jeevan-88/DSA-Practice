// Problem: Count vowels in a string
// Difficulty: Easy
// Date: Feb 6, 2026

import java.util.Scanner;

public class Problem7_CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        s = s.toLowerCase();

        int vowelCount = 0;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Vowels = " + vowelCount);
        sc.close();
    }
}