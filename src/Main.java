import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== UC7: Palindrome Using Deque =====");

        String input = "radar";  // Change this string to test other words

        // Create a Deque
        Deque<Character> deque = new LinkedList<>();

        // Insert all characters into deque (rear insertion)
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front & rear until deque has 0 or 1 element
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome ✅");
        } else {
            System.out.println(input + " is NOT a Palindrome ❌");
        }
    }
}