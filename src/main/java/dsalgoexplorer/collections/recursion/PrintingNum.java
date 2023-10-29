package dsalgoexplorer.collections.recursion;

public class PrintingNum {
    public static void main(String[] args) {
        int n = 6;

        printingNumber(n);

    }

    private static void printingNumber(int n) {
        if (n == 0) {
            return;
        }
        printingNumber(n - 1);
        System.out.print(n + "   ");

    }
}