package dsalgoking.leetcode75.prefixsum;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int result = pivotIndex(nums);
        System.out.println("Result: " + result);
    }

    public static int pivotIndex(int[] nums) {
        int[] leftSum = new int[nums.length];
        int sum = 0;
        leftSum[0] = 0;
        sum+=nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum = sum + nums[i];
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }

        for (int i = 0; i < nums.length; i++) {

            int lSum = leftSum[i];
            int rSum = sum  - nums[i]- lSum;
            if ( lSum == rSum) {
                return i;
            }
        }

        return -1;
    }
}
