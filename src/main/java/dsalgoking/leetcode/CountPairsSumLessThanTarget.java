import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountPairsSumLessThanTarget {

    public static void main(String[] args) {
   
        Integer[] nums = new Integer[] { -1, 1, 0, -3, 3 };
        int target = 3;
        int result = countPairs(Arrays.asList(nums), target);
        System.out.println("result: " + (result));

    }

   static public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count = 0;

    for (int i = 0; i < nums.size(); i++) { 
        int left = i + 1;
        int right = nums.size();
      
        // Perform a binary search to find pairs
        while (left < right) {
          
            //windows mid ref to left
            int mid = left + Math.round((right - left - 1) / 2);
            
            // Compare the element at 'mid' with the target difference.
            if (nums.get(mid) < (target - nums.get(i))) {
                // If the element is less, adjust 'left' to move towards the right.
                left = mid + 1;
            } else {
                // If the element is greater or equal, adjust 'right' to move towards the left.
                right = mid;
            }
        }

        // Update the 'count' with the number of pairs found for the current 'i'.
        count = count + (left - (i + 1));
    }


        return count;
    }

}
