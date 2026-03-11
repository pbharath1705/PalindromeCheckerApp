/**
 * =============================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * =============================================================
 *
 * Use Case 4: Character Array Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by converting it to a character array and using
 * the two-pointer technique.
 *
 * At this stage, the application:
 * - Converts string to char[]
 * - Uses two pointers (start and end)
 * - Compares characters from both ends
 * - Displays the validation result
 *
 * This introduces array-based comparison with two-pointer approach.
 *
 * @author Developer
 * @version 4.0
 */
public class PalindromeCheckerApp {
    /**
     * Application entry point for UC4.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "racecar"; // Example input
        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        // Two-pointer approach: compare characters from both ends
        while (start < end) {
            if (chars[start] != chars[end]) {
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
