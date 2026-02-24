public class Main {

    public static void main(String[] args) {

        System.out.println("===== UC3: Palindrome Check Using String Reverse =====");

        // Original string
        String original = "level";

        // Variable to store reversed string
        String reversed = "";

        // Reverse string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed string
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome ✅");
        } else {
            System.out.println(original + " is NOT a Palindrome ❌");
        }
    }
}