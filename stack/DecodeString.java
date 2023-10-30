package stack;

import java.util.Stack;

public class DecodeString {

    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ']') {
                while (!stack.peek().equals("[")) {
                    sb.insert(0, stack.pop());
                }
                String pattern = sb.toString();
                sb.setLength(0);
                stack.pop();
                while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
                    sb.insert(0, stack.pop());
                }
                int times = Integer.parseInt(sb.toString());
                sb.setLength(0);
                while (times > 0) {
                    sb.append(pattern);
                    times--;
                }
                stack.push(sb.toString());
                sb.setLength(0);
            } else {
                stack.push(String.valueOf(s.charAt(i)));
            }
        }
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }
}
