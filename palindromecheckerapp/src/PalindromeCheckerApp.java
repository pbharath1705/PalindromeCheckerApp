/**
 * =============================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * =============================================================
 *
 * Use Case 11: Object-Oriented Palindrome Check
 *
 * Description:
 * This class uses Object-Oriented Programming principles
 * to check palindrome by encapsulating the logic inside
 * a dedicated PalindromeChecker class.
 *
 * At this stage, the application:
 * - Defines a PalindromeChecker class with a check method
 * - Encapsulates palindrome logic inside the class
 * - Uses object instantiation to perform the check
 * - Displays the validation result
 *
 * @author Developer
 * @version 11.0
 */

class PalindromeChecker {
    private String input;

    public PalindromeChecker(String input) {
        this.input = input;
    }

    public boolean check() {
        String normalized = input.toLowerCase().replaceAll("\\s+", "");
        int start = 0, end = normalized.length() - 1;
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) return false;
            start++; end--;
        }
        return true;
    }

    public String getInput() { return input; }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker("Able was I ere I saw Elba");
        if (checker.check()) {
            System.out.println("The string \"" + checker.getInput() + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + checker.getInput() + "\" is NOT a palindrome.");
        }
    }
}
