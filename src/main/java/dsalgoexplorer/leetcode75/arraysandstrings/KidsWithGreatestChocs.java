package dsalgoexplorer.leetcode75.arraysandstrings;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestChocs {
    public static void main(String[] args) {
        int[] candies = new int[]{2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        System.out.println("Result: " + result);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        for(int candyAtKid : candies){
            max = Math.max(max,candyAtKid);
        }

        for(int candyAtKid : candies){
            int totalCandy = candyAtKid + extraCandies;
            result.add(totalCandy >= max);
        }

        return result;
    }
}
