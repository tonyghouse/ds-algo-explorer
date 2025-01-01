package dsalgoexplorer.leetcode75.arraysandstrings;

public class RevVowelsString {
    public static void main(String[] args) {

        String s = "helloi";
        String result = reverseVowels(s);
        System.out.println("Result: " + result);

    }

    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {

            if (!isVowel(arr[i])) {
                i++;
            }

            if (!isVowel(arr[j])) {
                j--;
            }

            if (isVowel(arr[i]) && isVowel(arr[j])) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return String.valueOf(arr);
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static boolean isVowel(char c) {
        if (c == 'a' || c == 'A') {
            return true;
        }

        if (c == 'e' || c == 'E') {
            return true;
        }

        if (c == 'i' || c == 'I') {
            return true;
        }

        if (c == 'o' || c == 'O') {
            return true;
        }
        if (c == 'u' || c == 'U') {
            return true;
        }

        return false;
    }

}
