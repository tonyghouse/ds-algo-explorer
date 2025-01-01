package dsalgoking.leetcode75.prefixsum;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int result = largestAltitude(gain);
        System.out.println("Result: "+result);
    }

    public static int largestAltitude(int[] gain) {
        int sum = 0;
        int maxy = 0;
        for(int x: gain){
            sum = sum+x;

            maxy  = Math.max(sum,maxy);

        }
        return maxy;

    }
}
