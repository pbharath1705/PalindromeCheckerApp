import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

/**
 * =============================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * =============================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * This class uses the Strategy Pattern to dynamically choose
 * a palindrome checking algorithm at runtime.
 *
 * At this stage, the application:
 * - Defines a PalindromeStrategy interface
 * - Implements StackStrategy using Stack data structure
 * - Implements DequeStrategy using Deque data structure
 * - Injects strategy at runtime via polymorphism
 * - Displays the validation result
 *
 * @author Developer
 * @version 12.0
 */

/**
 * PalindromeStrategy - Strategy Interface
 * Defines the contract for all palindrome checking strategies.
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * StackStrategy - Stack-based palindrome implementation
 *
 * This class provides a Stack based implementation
 * of the PalindromeStrategy interface.
 *
 * It uses LIFO behavior to reverse characters
 * and compare them with the original sequence.
 */
class StackStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using Stack.
     *
     * @param input String to validate
     * @return true if palindrome, false otherwise
     */
    public boolean check(String input) {
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        // Create a stack to store characters.
        Stack<Character> stack = new Stack<>();

        // Push each character of the input string onto the stack.
        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack.
        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) return false;
        }

        return true;
    }
}

/**
 * DequeStrategy - Deque-based palindrome implementation
 *
 * This class provides a Deque based implementation
 * of the PalindromeStrategy interface.
 *
 * It uses both ends of the deque to compare
 * characters from the front and back simultaneously.
 */
class DequeStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using Deque.
     *
     * @param input String to validate
     * @return true if palindrome, false otherwise
     */
    public boolean check(String input) {
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        // Create a deque to store characters.
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character of the input string to the deque.
        for (char c : normalized.toCharArray()) {
            deque.addLast(c);
        }

        // Compare characters from both ends.
        while (deque.size() > 1) {
            if (!deque.pollFirst().equals(deque.pollLast())) return false;
        }

        return true;
    }
}

/**
 * PalindromeContext - Holds the injected strategy
 *
 * This class uses composition to inject a strategy
 * and delegates the palindrome check to it.
 */
class PalindromeContext {
    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeCheck(String input) {
        return strategy.check(input);
    }
}

/**
 * UseCase12PalindromeCheckerApp - Main Entry Point
 */
class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Inject StackStrategy at runtime
        PalindromeContext context = new PalindromeContext(new StackStrategy());
        boolean result = context.executeCheck(input);
        System.out.println("Is Palindrome? : " + result);

        scanner.close();
    }
}
