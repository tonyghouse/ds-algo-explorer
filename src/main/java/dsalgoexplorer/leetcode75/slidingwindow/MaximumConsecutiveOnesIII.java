package dsalgoexplorer.leetcode75.slidingwindow;

public class MaximumConsecutiveOnesIII {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k = 3; // allowable zeros
        int result = longestOnes(nums, k);
        System.out.println("Result: " + result);

    }

    public static int longestOnes(int[] nums, int k) {
        // acquire & release strategy (sliding window)
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

            //release (to make a valid string)
            while(coz>k){
                j++;
                if(nums[j] == 0) {
                    coz--;
                }
            }

            //calculate window size
            int windowSize = (i - 1) - (j - 1) - 1; //inclusive (r-l-1);
            maxOnes = Math.max(maxOnes,windowSize);
        }

        return maxOnes;
    }
}
