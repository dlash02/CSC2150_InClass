import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class palidromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }

    private static boolean isPalindrome(String input) {
                Deque<Character> deque = new ArrayDeque<>();

                // Convert the input string to lowercase and filter out non-alphanumeric characters
                for (char ch : input.toLowerCase().toCharArray()) {
                    if (Character.isLetterOrDigit(ch)) {
                        deque.addLast(ch);  // Add valid characters to the deque
                    }
                }

                // Check characters from both ends of the deque
                while (deque.size() > 1) {
                    if (deque.removeFirst() != deque.removeLast()) {
                        return false;  // Not a palindrome
                    }
                }
                return true;  // It's a palindrome
            }


}
