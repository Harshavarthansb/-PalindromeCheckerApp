import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define the input string
        String input = "level";

        // Create LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add characters to the LinkedList
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        // Compare first and last elements
        while (list.size() > 1) {

            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}