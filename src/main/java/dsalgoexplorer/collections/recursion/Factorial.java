package dsalgoexplorer.collections.recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;

        int result = fac(n);

        System.out.println("result: " + result);

    }

    private static int fac(int n) {
        if (n == 0) {
            return 1;
        }

        int subFacN = fac(n - 1); //imp


        int facN = n * subFacN;
        return facN;
    }

}
