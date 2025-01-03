package dsalgoking.daywise.january2025.jan3;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        System.out.println("LeetCode-238(Medium) Product of array except self");
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int[] result = productExceptSelf(nums);
        System.out.println("Result: " + Arrays.toString(result));
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        //left array
        int[] leftArr = new int[n];
        leftArr[0] = 1;
        for (int i = 1; i < n; i++) {
            leftArr[i] = leftArr[i - 1] * nums[i - 1];
        }


        //right array
        int[] rightArr = new int[n];
        rightArr[n - 1] = 1;
        for (int j = (n-1)-1; j >= 0; j--) {
            rightArr[j] = rightArr[j + 1] * nums[j + 1];
        }

        for (int k = 0; k < n; k++) {
            res[k] = leftArr[k] * rightArr[k];
        }

        return res;

    }
}
