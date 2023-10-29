package dsalgoexplorer.collections.recursion;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 1001, 2002, 3003, 4004, 5005, 6006, 7007 };

        int key = 4004;
        int result = searchArr(arr, key, 0);
        System.out.println("result: "+result);

    }

    private static int searchArr(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        } 
        
        int idx = searchArr(arr, key, i + 1);
        return idx;
        

    }
}
