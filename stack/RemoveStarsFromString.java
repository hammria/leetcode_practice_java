package stack;

import java.util.ArrayList;
import java.util.List;

public class RemoveStarsFromString {

    public String removeStars(String s) {
        StringBuilder stack = new StringBuilder();
        int tail = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*' && tail > 0) {
                tail--;
                stack.setLength(tail);
            } else {
                stack.append(s.charAt(i));
                tail++;
            }
        }
        return stack.toString();
    }
}
