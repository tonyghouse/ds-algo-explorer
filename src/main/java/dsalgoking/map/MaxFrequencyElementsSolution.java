package dsalgoexplorer.map;


import java.util.HashMap;
import java.util.Map;

public class MaxFrequencyElementsSolution {
    public static void main(String[] args) {
        System.out.println("MaxFrequencyElementsSolution");
        int[] nums = new int[]{1,2,2,3,1,4};
        int result = maxFrequencyElements(nums);
        System.out.println("result: "+result);
    }

    public static int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> freqMap = new HashMap<>();

        for(int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        for(int freq : freqMap.values()){
            maxFreq = Math.max(maxFreq,freq);
        }
        

        int totalCount = 0;
        for (int freq : freqMap.values()) {
            if (freq == maxFreq) {
                totalCount = totalCount+freq;
            }
        }

        return totalCount;

    }
}