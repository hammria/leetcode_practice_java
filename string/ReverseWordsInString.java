package string;

public class ReverseWordsInString {

    public String reverseWords(String s) {
        String[] array = s.strip().split("\\s+");
        StringBuilder sb = new StringBuilder(array[array.length - 1]);
        for (int i = array.length - 2; i >= 0; i--) {
            sb.append(" ");
            sb.append(array[i]);
        }
        return sb.toString();
    }
}
