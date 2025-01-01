package dsalgoexplorer.twopointers;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Palindrome Number");
        int x = 102;
        boolean result = isPalindrome(x);
        System.out.println("Result: "+result);
    }

    public static boolean isPalindrome(int x) {
        char[] arr = String.valueOf(x).toCharArray();
        int l=0;
        int r = arr.length-1;

        while(l<r){
            if(arr[l] != arr[r]){
                return false;
            } else{
                l++;
                r--;
            }

        }

        return true;
    }
}
