package dsalgoexplorer.sorting;

import java.util.Arrays;
import java.util.Random;
//just for testing acccuracy of algos
import static dsalgoexplorer.sorting.SortTestUtil.testWithAscSort;
import static dsalgoexplorer.sorting.SortTestUtil.testWithDescSort;

public class SortExplorer {
    public static void main(String[] args) {

        //int[] arr = new int[]{2,4,55,0,12,7};
        int[] arr  = new Random().ints(10000, -1000, 1000).toArray();
        int[] clonedArr = Arrays.copyOf(arr, arr.length);

        //selectionSort(arr);
        //bubbleSort(arr);
        //bubbleSort2(arr);
        insertionSort(arr);


        //boolean result = testWithAscSort(arr, clonedArr);
        boolean result = testWithDescSort(arr, clonedArr);
        System.out.println("result: " + result);
        System.out.println("arr1: " + Arrays.toString(arr));
        System.out.println("arr2: " + Arrays.toString(clonedArr));
    }


    private static void selectionSort(int[] arr) {
        System.out.println("running selection sort");
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[minIdx]) {
                    minIdx = j;
                }
            }
            //swapping
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    private static void bubbleSort(int[] arr) {
        System.out.println("running bubble sort");
        int n = arr.length;
        // varname: i or b for bound
        for (int b = n - 1; b >= 1; b--) {

            for (int j = 0; j <= b - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }

        }
    }

    private static void bubbleSort2(int[] arr) {
        System.out.println("running bubble sort 2");
        int n = arr.length;
        // varname: i or b for bound
        for (int b = n ; b > 0; b--) {

            for (int j = 0; j < b - 1; j++) {

                if (arr[j] < arr[j + 1]) {
                    //swap
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }

        }
    }



    private static void insertionSort(int[] arr) {
        int n = arr.length;
        
    }


}
