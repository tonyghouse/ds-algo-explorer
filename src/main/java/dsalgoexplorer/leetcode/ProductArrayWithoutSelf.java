import java.util.Arrays;

/*
 * Leetcode 238
 * https://leetcode.com/problems/product-of-array-except-self/
 */

public class ProductArrayWithoutSelf {
    public static void main(String[] args) {
        // int[] nums = new int[] { 1, 2, 3, 4 };
        int[] nums = new int[] { -1, 1, 0, -3, 3 };
        int[] result = productExceptSelf(nums);
        System.out.println("result: " + Arrays.toString(result));
    }

    static public int[] productExceptSelf(int[] nums) {

        int[] resultArr = new int[nums.length];

        int pre = 1;
        resultArr[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            pre = nums[i - 1] * pre;
            resultArr[i] = pre;
        }

        int post = 1;
        for (int j = nums.length - 1; j >= 0; j--) {
            resultArr[j] = resultArr[j] * post;
            post = post * nums[j];
        }

        return resultArr;

    }
}