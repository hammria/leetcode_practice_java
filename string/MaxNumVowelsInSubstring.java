package string;

public class MaxNumVowelsInSubstring {

    public int maxVowels(String s, int k) {
        int i = 0;
        int cur = 0;
        while (i < k) {
            if (isVowel(s.charAt(i))) {
                cur++;
            }
            i++;
        }
        int max = cur;
        while (i < s.length()) {
            if (isVowel(s.charAt(i))) {
                cur++;
            }
            if (isVowel(s.charAt(i - k))) {
                cur--;
            }
            if (cur > max) {
                max = cur;
            }
            i++;
        }
        return max;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u';
    }
}
