package dsalgoexplorer.slidingwindow;


/*
 1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
 */
public class CountOfMaxSubArraysAverageThanThreshold {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,3,4,5,6};
        int k = 3;
        int t = 2;

        int result = getCountOfMaxSubArraysAverageThanThreshold(arr,k,t);
        System.out.println("Result: "+result);


    }

    private static int getCountOfMaxSubArraysAverageThanThreshold(int[] arr, int k, int threshold) {
        int count = 0;
        int subArrSum = 0;

        int j=0;
        while(j<k){
            subArrSum+=arr[j];
            j++;
        }

        double avg = (double) subArrSum/k;
        if(avg >= threshold){
          count++;
        }

        for(int i=1; i< arr.length - k +1;i++){
            subArrSum = subArrSum - arr[i-1] +arr[i+k-1];

            double tempAvg = (double) subArrSum/k;
            if(tempAvg >= threshold){
                count++;
            }
        }


        return count;
    }
}
