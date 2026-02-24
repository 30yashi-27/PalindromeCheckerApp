public class Main {

    public static void main(String[] args) {

        System.out.println("===== UC4: Palindrome Using Character Array =====");

        String input = "racecar";

        // Convert string to character array
        char[] characters = input.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome ✅");
        } else {
            System.out.println(input + " is NOT a Palindrome ❌");
        }
    }
}