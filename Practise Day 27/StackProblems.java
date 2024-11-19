
// StackProblems.java

import java.util.Stack;

public class StackProblems {

    // Problem 1: Reverse a Stack
    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) return;
        int temp = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, temp);
    }

    private static void insertAtBottom(Stack<Integer> stack, int value) {
        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }
        int temp = stack.pop();
        insertAtBottom(stack, value);
        stack.push(temp);
    }

    // Problem 2: Check Balanced Parentheses
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;
                char open = stack.pop();
                if (!isMatchingPair(open, ch)) return false;
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    // Problem 3: Sort a Stack
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sortStack(stack);
            sortedInsert(stack, temp);
        }
    }

    private static void sortedInsert(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || value > stack.peek()) {
            stack.push(value);
            return;
        }
        int temp = stack.pop();
        sortedInsert(stack, value);
        stack.push(temp);
    }

    public static void main(String[] args) {
        // Test Reverse Stack
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        System.out.println("Original Stack: " + stack1);
        reverseStack(stack1);
        System.out.println("Reversed Stack: " + stack1);

        // Test Balanced Parentheses
        String expression = "{[()]}";
        System.out.println("Is Balanced: " + isBalanced(expression));

        // Test Sort Stack
        Stack<Integer> stack2 = new Stack<>();
        stack2.push(34);
        stack2.push(3);
        stack2.push(31);
        stack2.push(98);
        stack2.push(92);
        stack2.push(23);
        System.out.println("Original Stack: " + stack2);
        sortStack(stack2);
        System.out.println("Sorted Stack: " + stack2);
    }
}
