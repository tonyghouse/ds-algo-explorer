package dsalgoking.daywise.january.jan1;

public class MergeStringsAlternatively {

    public static void main(String[] args) {
        System.out.println("LeetCode-1768(Easy) Merge Strings Alternatively");

        String word1 = "abcde", word2 = "pqrstuv";
        String result = mergeStringsAlternatively(word1, word2);
        System.out.println("Result: "+result);


    }

    private static String mergeStringsAlternatively(String word1, String word2) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < word1.length() && j < word2.length()) {
            stringBuilder.append(word1.charAt(i));
            stringBuilder.append(word2.charAt(j));
            i++;
            j++;
        }

        while (i < word1.length()) {
            stringBuilder.append(word1.charAt(i));
            i++;
        }

        while (j < word2.length()) {
            stringBuilder.append(word2.charAt(j));
            j++;
        }

        return stringBuilder.toString();
    }
}
