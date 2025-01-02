package dsalgoking.daywise.january2025.jan2;

public class ReverseWordsInString {
    public static void main(String[] args) {
        System.out.println("LeetCode-151(Medium) Reverse words in string");
        String s = "the sky is blue";
        String result = reverseWords(s);
        System.out.println("Result: " + result);
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int j = words.length-1; j >= 0; j--) {
            sb.append(words[j]);
            if (j != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
