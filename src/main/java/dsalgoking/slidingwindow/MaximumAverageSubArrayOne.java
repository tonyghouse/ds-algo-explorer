package dsalgoking.slidingwindow;


/*
   Leetcode 643. Maximum Average subarray I
 */
public class MaximumAverageSubArrayOne {
    public static void main(String[] args) {
        int [] arr = new int[]{0,1,2,3,4,5,6,7};
        int k = 3;

        double maxAvg = getMaximumAverageSubArray(arr,k);
        System.out.println("Result: "+maxAvg);

    }

    private static double getMaximumAverageSubArray(int[] arr, int k) {
        double maxAvg = 0;
        int j = 0;
        int subArrSum= 0;

        while(j < k){
            subArrSum += arr[j];
            j++;
        }



        for(int i = 1 ; i < arr.length - k + 1; i++ ){
            int newMaxAvg = subArrSum/k;
            maxAvg = Math.max(newMaxAvg,maxAvg);

            subArrSum = subArrSum + arr[i+k-1];

            subArrSum = subArrSum - arr[i-1];

        }

        return maxAvg;
    }
}
