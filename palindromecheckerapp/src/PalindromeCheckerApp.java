/**
 * =============================================================
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 * =============================================================
 *
 * Use Case 9: Recursive Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a recursive approach, calling itself with
 * progressively smaller substrings.
 *
 * At this stage, the application:
 * - Uses a recursive method with start and end indices
 * - Base case: start >= end means palindrome
 * - Compares characters at start and end positions
 * - Recursively checks the inner substring
 *
 * This demonstrates recursion-based palindrome validation.
 *
 * @author Developer
 * @version 9.0
 */
public class PalindromeCheckerApp {

    /**
     * Recursively checks if the string is a palindrome.
     *
     * @param str   The input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindrome(String str, int start, int end) {
        // Base case: if start >= end, it's a palindrome
        if (start >= end) {
            return true;
        }
        // If characters at start and end don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        // Recursively check the inner substring
        return isPalindrome(str, start + 1, end - 1);
    }

    /**
     * Application entry point for UC9.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "kayak"; // Example input

        if (isPalindrome(input, 0, input.length() - 1)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }
    }
}
