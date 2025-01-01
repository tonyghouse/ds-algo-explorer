package dsalgoexplorer.twopointers;

public class TwoPointersExplorer {
    public static void main(String[] args) {
        System.out.println("Two pointer Explorer");

        int[] arr = new int[]{0,1,2,3,4,5,6};

        int l = 0;
        int r = arr.length -1;

        while(l<r){


            System.out.println("L: "+l);
            System.out.println("R: "+r);
            System.out.println("\n");

            l++;
            r--;
        }


    }
}
