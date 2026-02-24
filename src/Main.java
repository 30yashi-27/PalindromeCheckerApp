import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== UC6: FIFO vs LIFO (Queue vs Stack) =====");

        String input = "level";

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Insert characters into both structures
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);   // Enqueue
            stack.push(ch);  // Push
        }

        boolean isPalindrome = true;

        // Compare dequeue (FIFO) and pop (LIFO)
        while (!queue.isEmpty()) {

            char fromQueue = queue.remove();  // Dequeue
            char fromStack = stack.pop();     // Pop

            if (fromQueue != fromStack) {
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