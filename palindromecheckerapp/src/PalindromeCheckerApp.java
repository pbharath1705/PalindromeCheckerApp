import java.util.LinkedList;

/**
 * =============================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * =============================================================
 *
 * Use Case 8: Linked List Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a LinkedList to store characters and then
 * comparing using the two-pointer technique.
 *
 * At this stage, the application:
 * - Stores characters in a LinkedList
 * - Uses get() to compare first and last positions
 * - Moves pointers toward the center
 * - Displays the validation result
 *
 * This demonstrates LinkedList-based palindrome validation.
 *
 * @author Developer
 * @version 8.0
 */
public class PalindromeCheckerApp {
    /**
     * Application entry point for UC8.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "civic"; // Example input
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;
        int start = 0;
        int end = list.size() - 1;

        // Compare characters from both ends
        while (start < end) {
            if (!list.get(start).equals(list.get(end))) {
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
