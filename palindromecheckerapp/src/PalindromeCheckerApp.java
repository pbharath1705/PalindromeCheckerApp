/**
 * =============================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * =============================================================
 *
 * Use Case 10: Case-Insensitive and Space-Insensitive Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * while ignoring case differences and spaces, making
 * it suitable for real-world phrase validation.
 *
 * At this stage, the application:
 * - Converts the string to lowercase
 * - Removes all spaces from the string
 * - Applies two-pointer comparison
 * - Displays the validation result
 *
 * This demonstrates input normalization before palindrome check.
 *
 * @author Developer
 * @version 10.0
 */
public class PalindromeCheckerApp {
    /**
     * Application entry point for UC10.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama"; // Example input

        // Normalize: convert to lowercase and remove spaces
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        int start = 0;
        int end = normalized.length() - 1;
        boolean isPalindrome = true;

        // Two-pointer comparison on normalized string
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }
    }
}
