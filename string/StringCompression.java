package string;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {

    public int compress(char[] chars) {
        int slow = 0;
        int fast = 0;
        while (fast < chars.length) {
            int count = 0;
            char cur = chars[fast];
            chars[slow] = cur;
            while (fast < chars.length && chars[fast] == cur) {
                count++;
                fast++;
            }
            slow++;
            if (count > 1) {
                String s = String.valueOf(count);
                for (int i = 0; i < s.length(); i++) {
                    chars[slow] = s.charAt(i);
                    slow++;
                }
            }
        }
        return slow;
    }


}
