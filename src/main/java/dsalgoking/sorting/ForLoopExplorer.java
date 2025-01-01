package dsalgoking.sorting;

import java.util.Arrays;

public class ForLoopExplorer {
    public static void main(String[] args) {
        int[] arr = new int[] {0,1,2,3,4,5,6,7,8,9};
        int n =  arr.length;
        int k=3;
        int j =0;
        int sum = 0;
        while(j<k){
            sum = sum + arr[j];
            j++;
        }

        System.out.println("\n");
        for(int i=1; i<=n-k; i++){
            int [] window = Arrays.copyOfRange(arr, i, i+k);
            sum = sum - arr[i-1];
            sum = sum + arr[i+k-1];
            System.out.println(Arrays.toString(window)+" > "+sum);
        }
    }

    private static int getWindowSum(int[] arr){
        int sum = 0;
        for(int x: arr){
            sum +=x;
        }
        return  sum;
    }

}
