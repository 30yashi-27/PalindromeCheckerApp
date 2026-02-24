import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== UC5: Palindrome Using Stack =====");

        String input = "madam";

        // Create Stack
        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop characters and compare
        for (int i = 0; i < input.length(); i++) {

            char poppedChar = stack.pop();

            if (input.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome ✅");
        } else {
            System.out.println(input + " is NOT a Palindrome ❌");
        }
    }
}