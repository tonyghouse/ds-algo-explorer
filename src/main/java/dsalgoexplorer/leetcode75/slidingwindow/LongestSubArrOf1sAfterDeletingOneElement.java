package dsalgoexplorer.leetcode75.slidingwindow;

public class LongestSubArrOf1sAfterDeletingOneElement {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 0, 1};
        int result = longestSubarray(nums);
        System.out.println("Result: " + result);

    }

    public static int longestSubarray(int[] nums) {
        int k = 1;//only single 0 is allowed
        int maxOnes = 0;
        int j = -1;
        int i = 0;
        int coz = 0;

        while (i < nums.length) {
            //acquire
            if (nums[i] == 0) {
                coz++;
                i++;
            } else {
                i++;
            }

            while (coz > k) {
                j++;
                if (nums[j] == 0) {
                    coz--;
                }
            }

            int windowSize = (i - 1) - (j - 1) - 1;
            maxOnes = Math.max(maxOnes, windowSize);

        }


        return maxOnes - 1;//coz single 0 is getting deleted
    }
}
