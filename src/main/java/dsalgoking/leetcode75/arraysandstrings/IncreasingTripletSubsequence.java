package dsalgoking.leetcode75.arraysandstrings;

public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
       int[] nums = new int[]{2,1,5,0,4,6};
       boolean result = increasingTriplet(nums);
        System.out.println("Result: "+result);
    }

    public static boolean increasingTriplet(int[] nums) {

        int num1 = Integer.MAX_VALUE;
        int num2 = Integer.MAX_VALUE;

        for(int i =0; i< nums.length; i++){
            int num3 = nums[i];

            if(num1<=num3){
               num1= num3;
            }else if(num2<=num3){
                num2= num3;
            }else{
                return true;
            }
        }

        return false;
    }
}
