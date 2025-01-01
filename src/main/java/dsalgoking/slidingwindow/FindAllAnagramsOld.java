package dsalgoking.slidingwindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
  Leetcode 438 Find all anagrams in the string
 */
public class FindAllAnagramsOld {
    //Old/Naive Approach
    public static void main(String[] args) {
        System.out.println("Finding all anagrams in the string");
//        String s = "cbaebabacd";
//        String p = "abc";
        String s = "aaaaaaaaaa";
        String p = "aaaaaaaaaaaaa";

       List<Integer> result = findAllAnagrams(s,p);
        System.out.println("Result: "+result);
    }

    private static List<Integer> findAllAnagrams(String s, String p) {
        if(p.length() > s.length()){
            return Collections.emptyList();

        }
        int k = p.length();
        char[] arr = s.toCharArray();
        List<Integer> result = new ArrayList<>();
        Map<Character,Integer> anagramMap = new HashMap<>();
        for(Character ch : p.toCharArray()){
            anagramMap.put(ch, anagramMap.getOrDefault(ch,0)+1);
        }


        Map<Character,Integer> windowMap = new HashMap();

        int j=0;
        while(j<k){
            char ch = arr[j];
            windowMap.put(ch, windowMap.getOrDefault(ch, 0) + 1);
            j++;
        }

        if(windowMap.equals(anagramMap)){
            result.add(0); // checking for first index
        }

        for(int i=1; i<arr.length-k+1 ; i++){
            char adChar = arr[i + k - 1];
            windowMap.put(adChar, windowMap.getOrDefault(adChar, 0) + 1);

            char remChar = arr[i-1];
            Integer freq = windowMap.getOrDefault(remChar,0);
            if (freq - 1 <= 0) {
                windowMap.remove(remChar);
            } else {
                windowMap.put(remChar, freq - 1);
            }


            if(windowMap.equals(anagramMap)){
                result.add(i);
            }
        }

        return  result;

    }

}
