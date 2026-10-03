import java.util.Stack;

public class validStackSequence {

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j = 0; // Pointer for popped array

        for (int x : pushed) {
            stack.push(x);

            // Pop from stack while top matches popped[j]
            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }

        // If all elements were popped correctly, j will equal popped.length
        return j == popped.length;
    }

    public static void main(String[] args) {
        // Test Case 1: Valid sequence
        int[] pushed1 = {1, 2, 3, 4, 5};
        int[] popped1 = {4, 5, 3, 2, 1};
        System.out.println("Test 1 Valid? " + validateStackSequences(pushed1, popped1)); // Expected: true

        // Test Case 2: Invalid sequence
        int[] pushed2 = {1, 2, 3, 4, 5};
        int[] popped2 = {4, 3, 5, 1, 2};
        System.out.println("Test 2 Valid? " + validateStackSequences(pushed2, popped2)); // Expected: false
    }
}