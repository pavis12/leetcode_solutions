import java.util.*;

class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder result = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        // Iterate through the pattern and build the sequence
        for (int i = 0; i <= pattern.length(); i++) {
            // Push the current number onto the stack
            stack.push(i + 1);

            // If we reach an 'I' or the end of the pattern, pop from the stack
            if (i == pattern.length() || pattern.charAt(i) == 'I') {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
            }
        }

        return result.toString();
    }
}
