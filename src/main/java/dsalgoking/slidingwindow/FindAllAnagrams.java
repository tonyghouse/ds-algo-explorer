package dsalgoexplorer.slidingwindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
  Leetcode 438 Find all anagrams in the string
 */
public class FindAllAnagrams {
    public static void main(String[] args) {
        System.out.println("Finding all anagrams in the string");
        String s = "cbaebabacd";
        String p = "abc";

       List<Integer> result = findAllAnagrams(s,p);
        System.out.println("Result: "+result);
    }

    private static List<Integer> findAllAnagrams(String s, String p) {
        if(p.length() > s.length()){
            return Collections.emptyList();

        }
        List<Integer> result = new ArrayList<>();

        return  result;

    }

}
