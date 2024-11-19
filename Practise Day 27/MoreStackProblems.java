
// MoreStackProblems.java

import java.util.Stack;

public class MoreStackProblems {

    // Problem 1: Next Greater Element
    public static int[] nextGreaterElement(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        return result;
    }

    // Problem 2: Implement Stack using Two Queues (basic functionality)
    static class StackUsingQueues {
        java.util.Queue<Integer> queue1 = new java.util.LinkedList<>();
        java.util.Queue<Integer> queue2 = new java.util.LinkedList<>();

        public void push(int x) {
            queue1.add(x);
        }

        public int pop() {
            while (queue1.size() > 1) {
                queue2.add(queue1.remove());
            }
            int poppedElement = queue1.remove();
            java.util.Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;
            return poppedElement;
        }

        public int top() {
            while (queue1.size() > 1) {
                queue2.add(queue1.remove());
            }
            int topElement = queue1.peek();
            queue2.add(queue1.remove());
            java.util.Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;
            return topElement;
        }

        public boolean isEmpty() {
            return queue1.isEmpty();
        }
    }

    public static void main(String[] args) {
        // Test Next Greater Element
        int[] nums = {4, 5, 2, 25};
        int[] result = nextGreaterElement(nums);
        System.out.print("Next Greater Elements: ");
        for (int r : result) {
            System.out.print(r + " ");
        }
        System.out.println();

        // Test Stack Using Two Queues
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top Element: " + stack.top());
        System.out.println("Popped Element: " + stack.pop());
        System.out.println("Is Stack Empty: " + stack.isEmpty());
    }
}
