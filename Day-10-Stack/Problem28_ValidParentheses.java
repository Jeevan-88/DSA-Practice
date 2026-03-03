// Problem: https://leetcode.com/problems/valid-parentheses/
// Difficulty: Easy
// Pattern: Stack
// Date: Feb 26, 2026
// Approach: Use a stack to keep track of opening parentheses. For each closing parenthesis, check if the top of the stack has the corresponding opening parenthesis. If it does, pop it from the stack. At the end, if the stack is empty, the parentheses are valid.
// Time Complexity: O(n), where n is the length of the input string. We traverse the string once.
// Space Complexity: O(n) in the worst case, when all characters are opening parentheses and we push them onto the stack. In the best case, when the string is valid and we pop all elements, the space complexity is O(1).
import java.util.Scanner;
import java.util.Stack;

public class Problem28_ValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean isValid = true;
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    isValid = false;
                    break;
                }
                char top = st.pop();
                if(ch ==')' && top != '('){
                    isValid = false;
                    break;
                }
                if (ch == ']' && top != '[') {
                    isValid = false;
                    break;
                }
                if (ch == '}' && top != '{') {
                    isValid = false;
                    break;
                }
            }
            
        }
        if(st.isEmpty() && isValid){
            System.out.println("Valid parentheses");
        }
        else{
            System.out.println("Invalid parentheses");
        }

    }
}