package dsalgoking.leetcode75.arraysandstrings;

import java.util.Arrays;

public class ProductArrExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int[] result = productExceptSelf(nums);
        System.out.println("Result: " + Arrays.toString(result));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        left[0] = 1;
        for (int i = 1; i < left.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }


        int[] right = new int[nums.length];
        right[nums.length - 1] = 1;
        for (int j = nums.length - 2; j >= 0; j--) {
            right[j] = right[j + 1] * nums[j + 1];
        }


        int[] arr = new int[nums.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = left[i] * right[i];
        }

        return arr;

    }

}
