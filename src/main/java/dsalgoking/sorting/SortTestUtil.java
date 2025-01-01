package dsalgoking.sorting;

import java.util.Arrays;

public class SortTestUtil {
    public static boolean testWithAscSort(int[] arr, int[] clonedArr) {
        String arrStr = Arrays.toString(arr);
        Arrays.sort(clonedArr);
        String clonedArrStr = Arrays.toString(clonedArr);
        return arrStr.equals(clonedArrStr);
    }
    public static boolean testWithDescSort(int[] arr, int[] clonedArr) {
        String arrStr = Arrays.toString(arr);
        sortDesc(clonedArr);
        String clonedArrStr = Arrays.toString(clonedArr);
        return arrStr.equals(clonedArrStr);
    }

    public static void sortDesc(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        //reverse
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

}
