package dsalgoking.slidingwindow;

import java.util.*;

/*
   Leetcode 1876. Substrings of Size 3 with Distinct Characters
 */
public class FindKLengthAnagrams {
    public static void main(String[] args) {
//        String s = "xyzzaz";
        String s = "aababcabc";
        int k = 2;

        int result = countGoodSubstrings(s,k);
        System.out.println("result : "+result);
    }

    public static int countGoodSubstrings(String s,int k) {

        if(s.length() < k){
            return 1;
        }

        char[] arr = s.toCharArray();
        ArrayList<Character> window = new ArrayList<>();
        int count = 0;
        int j = 0;


        while (j < k) {
            window.add(arr[j]);
            j++;
        }

        if (new HashSet<>(window).size() == k) {
            count++;
        }


        for (int i = 1; i < arr.length - k+1; i++) {
            char elem = arr[i-1];
            window.remove(Character.valueOf(elem));
            window.add(arr[i + k - 1]);

            if (new HashSet<>(window).size() == k) {
                count++;
            }
           }

        return count;

    }
}
