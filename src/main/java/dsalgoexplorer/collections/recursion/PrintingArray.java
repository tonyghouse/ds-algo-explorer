package dsalgoexplorer.collections.recursion;

public class PrintingArray {
    public static void main(String[] args) {
        int [] arr = new int[]{100,200,300,400,500};

    //    printArr(arr,0);
     //    printArr2(arr,arr.length-1);

    //    printRevArr(arr,arr.length-1);

          printRevArr2(arr,0);
    }

    
    private static void printArr(int[] arr, int i) {
         if(arr.length == i){
            return;
         }
         
        System.out.print(arr[i]+"  ");
        printArr(arr,i+1);
    }

     private static void printArr2(int[] arr, int i) {

           if(i ==-1){
            return;
         }
         
         printArr2(arr,i-1);
         System.out.print(arr[i]+"  ");
    }

    private static void printRevArr(int[] arr, int i) {

           if(i ==-1){
            return;
         }
         
        System.out.print(arr[i]+"  ");
        printRevArr(arr,i-1);
    }

     private static void printRevArr2(int[] arr, int i) {

           if(i == arr.length){
            return;
         }
         
         printRevArr2(arr,i+1);
         System.out.print(arr[i]+"  ");
    }

    
}
