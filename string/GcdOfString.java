package string;

public class GcdOfString {

    private String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int maxPossible = gcd(len1, len2);
        if (len1 == len2 && maxPossible == len1 && str1.equals(str2)) {
            return str1;
        }
        while (maxPossible >= 1) {
            if (str1.subSequence(0, maxPossible).equals(str2.subSequence(0, maxPossible))) {
                if (isMultipleOf(str1, maxPossible) && isMultipleOf(str2, maxPossible)) {
                    return str1.subSequence(0, maxPossible).toString();
                }
            }
            maxPossible--;
        }
        return "";

    }

    private boolean isMultipleOf(String str, int div) {
        if (str.length() % div != 0) {
            return false;
        }
        for (int i = 1; i < str.length() / div; i++) {
            for (int j = 0; j < div; j++) {
                if (str.charAt(i * div + j) != str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    private int gcd(int a, int b) {
        if (a == b) {
            return a;
        } else if (a > b) {
            return gcd(a - b, b);
        } else {
            return gcd(a, b - a);
        }
    }
}
