package string;

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        if (sl > tl) {
            return false;
        }
        if (sl == 0) {
            return true;
        }
        int head = 0;
        for (int i = 0; i < tl; i++) {
            if (t.charAt(i) == s.charAt(head)) {
                head++;
                if (head == sl) {
                    return true;
                }
            }
            if (tl - i < sl - head) {
                return false;
            }
        }
        return false;
    }
}
