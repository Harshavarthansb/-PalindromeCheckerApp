import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define the input string
        String input = "refer";

        // Create a Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Add characters to the deque
        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindrome = true;

        // Compare first and last characters
        while (deque.size() > 1) {

            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}