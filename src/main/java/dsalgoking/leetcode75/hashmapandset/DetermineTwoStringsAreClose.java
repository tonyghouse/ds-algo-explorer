package dsalgoking.leetcode75.hashmapandset;

import java.util.HashMap;
import java.util.Map;

public class DetermineTwoStringsAreClose {
    public static void main(String[] args) {
//        String word1 = "cabbba", word2 = "abbccc";
        String word1 = "abc", word2 = "bca";
        boolean result = closeStrings(word1, word2);
        System.out.println("Result: " + result);
    }

    public static boolean closeStrings(String word1, String word2) {
        HashMap<Character, Integer> w1Map = new HashMap<>();
        for (char c : word1.toCharArray()) {
            w1Map.compute(c, (k, v) -> v == null ? 1 : v + 1);
        }

        HashMap<Character, Integer> w2Map = new HashMap<>();
        for (char c : word2.toCharArray()) {
            w2Map.compute(c, (k, v) -> v == null ? 1 : v + 1);
        }


        boolean allCharsSame = isAllCharsSame(w1Map, w2Map);
        if(!allCharsSame){
            return false;
        }

        Map<Integer,Integer> w1Count = new HashMap<>();
        for(Integer cc: w1Map.values()){
            w1Count.compute(cc, (k,v) -> v == null ? 1 : v+1);
        }
        Map<Integer,Integer> w2Count = new HashMap();
        for(Integer cc: w2Map.values()){
            w2Count.compute(cc, (k,v) -> v == null ? 1 : v+1);
        }

        System.out.println("w1Count :"+w1Count);
        System.out.println("w2Count :"+w2Count);
        return w1Count.equals(w2Count);

    }

    private static boolean isAllCharsSame(HashMap<Character, Integer> w1Map, HashMap<Character, Integer> w2Map) {
        boolean allCharsSame = false;
        for(Character c : w1Map.keySet()){
            if(!w2Map.containsKey(c)){
                allCharsSame = false;
                break;
            }else{
                allCharsSame=true;
            }
        }
        return allCharsSame;
    }
}
