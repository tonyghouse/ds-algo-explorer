package dsalgoking.daywise.january2025.jan2;

public class ReverseVowelsInString {
    public static void main(String[] args) {
        System.out.println("LeetCode-345(Easy) Reverse vowels of a string");
        String s = "IceCreAm";
        String result = reverseVowels(s);
        System.out.println("Result: " + result);
    }

    public static String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] charArr = s.toCharArray();
        while (i < j) {
            char iChar = charArr[i];
            char jChar = charArr[j];
            if(!isVowelChar(iChar)){
                i++;
            }
            if(!isVowelChar(jChar)){
                j--;
            }

            if (isVowelChar(iChar) && isVowelChar(jChar)) {
                swap(charArr, i, j);
                i++;
                j--;
            }
        }

        return String.valueOf(charArr);
    }

    private static void swap(char[] charArr, int i, int j) {
        char temp = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = temp;
    }

    private static boolean isVowelChar(char value) {
        if (value == 'a' || value == 'A') {
            return true;
        }
        if (value == 'e' || value == 'E') {
            return true;
        }
        if (value == 'i' || value == 'I') {
            return true;
        }
        if (value == 'o' || value == 'O') {
            return true;
        }
        if (value == 'u' || value == 'U') {
            return true;
        }

        return false;
    }
}
