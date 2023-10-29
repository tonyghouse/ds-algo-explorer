
/*
 * Leetcode 2815
 * https://leetcode.com/problems/max-pair-sum-in-an-array/
 */

public class MaxPairSumInArray {
    public static void main(String[] args) {
        int[] nums = new int[] { 51, 71, 17, 37, 24, 42 };
        int result = maxPairSum(nums);
        System.out.println("result: " + (result));

    }

    static public int maxPairSum(int[] nums) {
        int res = -1;
        // array with max number for that digit (0-9)
        int[] maxNums = new int[10];

        for (int num : nums) {
            int maxD = getMaxDigit(num);

            if (maxNums[maxD] > 0) {
                int sumOfTwo = maxNums[maxD] + num;

                // check overall max result
                res = Math.max(res, sumOfTwo);
            }

            // update with max of existing or current num
            maxNums[maxD] = Math.max(num, maxNums[maxD]);

        }

        return res;

    }

    private static int getMaxDigit(int num) {
        int maxD = 0;
        int d = num;
        while (d > 0) {
            maxD = Math.max(maxD, d % 10);
            d = d / 10;
        }
        return maxD;
    }

}