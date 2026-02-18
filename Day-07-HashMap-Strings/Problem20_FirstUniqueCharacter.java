// Problem: Find first non-repeating character (LeetCode #387)
// Difficulty: Easy
// Pattern: HashMap Frequency Counting
// Date: Feb 17, 2026

import java.util.Scanner;
import java.util.HashMap;

public class Problem20_FirstUniqueCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.nextLine();
        
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.get(c) == 1){
                System.out.println("First Unique Character '" + c + "' at index: " + i);
                sc.close();
                return;
            }
        }
        System.out.println("No unique character found. Result: -1");
        
        
        sc.close();
    }
}
`1