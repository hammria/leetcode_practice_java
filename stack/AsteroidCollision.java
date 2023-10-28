package stack;

import java.util.Stack;

public class AsteroidCollision {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int cur : asteroids) {
            if (stack.isEmpty() || stack.peek() < 0 || cur > 0) {
                stack.push(cur);
                continue;
            }
            boolean destroyed = false;
            while (!stack.isEmpty() && stack.peek() > 0) {
                if ((stack.peek() + cur) < 0) {
                    stack.pop();
                } else if ((stack.peek() + cur) == 0) {
                    stack.pop();
                    destroyed = true;
                    break;
                } else {
                    destroyed = true;
                    break;
                }
            }
            if (!destroyed) {
                stack.push(cur);
            }
        }
        int[] ans = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;
    }
}
