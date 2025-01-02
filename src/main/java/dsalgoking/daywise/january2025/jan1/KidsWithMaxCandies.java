package dsalgoking.daywise.january2025.jan1;

import java.util.ArrayList;
import java.util.List;

public class KidsWithMaxCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        System.out.println("Result: " + result);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxVal = candies[0];
        for (int i = 1; i < candies.length; i++) {
            maxVal = Math.max(maxVal, candies[i]);
        }

        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            int totalCandies = extraCandies + candy;
//            if (totalCandies >= maxVal) {
//                result.add(true);
//            } else {
//                result.add(false);
//            }
            boolean flag = totalCandies >= maxVal;
            result.add(flag);
        }
        return result;
    }
}
