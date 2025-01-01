package dsalgoexplorer.leetcode75.hashmapandset;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurances {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,1,1,3};
        BigDecimal amount = BigDecimal.valueOf(1.12);
        BigDecimal rate = BigDecimal.valueOf(0.0009);

        System.out.println("Mult: "+amount.multiply(rate).setScale(9, RoundingMode.CEILING));
        boolean result = uniqueOccurrences(arr);
        System.out.println("Result: "+result);
    }

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> countMap = new HashMap<>();
        for(int i : arr){
            countMap.compute(i, (k,v) -> v == null ? 1 : v+1);
        }

        HashSet<Integer> uniqValuesSet = new HashSet<>(countMap.values());
        return countMap.size() == uniqValuesSet.size();
    }


}
