import java.util.Scanner;

/**
 * =============================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * =============================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class uses a palindrome strategy implementation,
 * captures execution start and end time, calculates total
 * execution duration and displays benchmarking results.
 *
 * This use case focuses purely on performance
 * measurement and algorithm comparison.
 *
 * The goal is to introduce benchmarking concepts.
 *
 * @author Developer
 * @version 13.0
 */
public class UseCase13PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Capture start time
        long startTime = System.nanoTime();

        // Palindrome check logic
        String normalized = input.toLowerCase().replaceAll("\\s+", "");
        boolean result = isPalindrome(normalized);

        // Capture end time
        long endTime = System.nanoTime();

        // Calculate execution duration
        long executionTime = endTime - startTime;

        // Display benchmarking results
        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + executionTime + " ns");

        scanner.close();
    }

    /**
     * Checks whether a normalized string is a palindrome.
     *
     * @param s normalized input string
     * @return true if palindrome, false otherwise
     */
    private static boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
