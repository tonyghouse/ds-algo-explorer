package dsalgoexplorer.twopointers;

import java.util.Arrays;

/*
 Leetcode 27- Remove Element
 */
public class RemoveElement {

    public static void main(String[] args) {
        System.out.println("Remove Element");

        int[] nums = new int[]{3,2,2,3};
        int val = 3;
        int result = removeElement(nums,val);
        System.out.println("result: "+result);
    }

    public static int removeElement(int[] nums, int val) {
        int p = 0;


        for(int q=0; q < nums.length; q++){
            if(nums[q] != val){
                nums[p] = nums[q];
                p++;
            }

        }


        System.out.println("Nums Arr: "+ Arrays.toString(nums));
        return p;
    }
}