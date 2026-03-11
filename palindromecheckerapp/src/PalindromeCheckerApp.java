import java.util.ArrayDeque;
import java.util.Deque;

/**
 * =============================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * =============================================================
 *
 * Use Case 7: Deque-Based Optimized Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a Deque (Double-Ended Queue), which allows
 * efficient access from both ends.
 *
 * At this stage, the application:
 * - Adds each character to the deque
 * - Compares characters from both ends simultaneously
 * - Removes matched characters from both ends
 * - Displays the validation result
 *
 * This demonstrates Deque-based palindrome validation.
 *
 * @author Developer
 * @version 7.0
 */
public class PalindromeCheckerApp {
    /**
     * Application entry point for UC7.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "noon"; // Example input
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;
        // Compare characters from both ends
        while (deque.size() > 1) {
            if (!deque.pollFirst().equals(deque.pollLast())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }
    }
}
