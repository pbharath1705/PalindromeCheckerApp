import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * =============================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * =============================================================
 *
 * Use Case 6: Queue + Stack Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by using both a Queue and a Stack. Characters are
 * enqueued and pushed simultaneously, then compared.
 *
 * At this stage, the application:
 * - Enqueues characters into a Queue (FIFO)
 * - Pushes characters onto a Stack (LIFO)
 * - Dequeues and pops to compare front vs rear
 * - Displays the validation result
 *
 * This demonstrates how Queue and Stack work together.
 *
 * @author Developer
 * @version 6.0
 */
public class PalindromeCheckerApp {
    /**
     * Application entry point for UC6.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "radar"; // Example input
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and push each character
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;
        // Compare front of queue with top of stack
        while (!queue.isEmpty()) {
            if (!queue.poll().equals(stack.pop())) {
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
