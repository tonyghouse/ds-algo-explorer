package dsalgoexplorer.leetcode75;

public class MergeStringsAlternatively {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";

        String result = mergeAlternately(word1, word2);
        System.out.println("result: " + result);
    }

    private static String mergeAlternately(String word1, String word2) {
        int i=0; //pointer to traverse
        StringBuilder result = new StringBuilder();

        while(i<word1.length() && i<word2.length()){
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
            i++;
        }

        while(i<word1.length()){
            result.append(word1.charAt(i));
            i++;
        }

        while(i<word2.length()){
            result.append(word2.charAt(i));
            i++;
        }

        return result.toString();
    }
}
