import java.util.Scanner;
import java.util.HashMap;
public class Problem19_ValidAnagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String s1 = sc.nextLine();
        System.out.println("Enter Second String: ");
        String s2 = sc.nextLine();
        if(s1.length() != s2.length()){
            System.out.println("Not anagram");
            return;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(char c: s1.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(char c : s2.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        if(map1.equals(map2)){
            System.out.println("Yes anagram");
        }
        else{
            System.out.println("Not anagram");
        }
    }
}

