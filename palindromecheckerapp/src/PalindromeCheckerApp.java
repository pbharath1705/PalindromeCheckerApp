import java.util.Stack;

/**
 * =============================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * =============================================================
 *
 * Use Case 5: Stack-Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by using a Stack data structure to reverse the string
 * and then comparing it with the original.
 *
 * At this stage, the application:
 * - Pushes each character onto a Stack
 * - Pops characters to build reversed string
 * - Compares original and reversed strings
 * - Displays the validation result
 *
 * This introduces Stack-based reversal for palindrome check.
 *
 * @author Developer
 * @version 5.0
 */
public class PalindromeCheckerApp {
    /**
     * Application entry point for UC5.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "level"; // Example input
        Stack<Character> stack = new Stack<>();

        // Push each character onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Pop characters to build reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        // Compare original and reversed strings
        if (input.equals(reversed.toString())) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }
    }
}
