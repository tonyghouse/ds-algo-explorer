package dsalgoexplorer.exceptions;

public class ExceptionsDemo {
    public static void main(String[] args) {
        int x = getRandom();
        System.out.println("x value: " + x);
    }

    private static Integer getRandom() {
        try {
            System.out.println("in try");
            int x=1/0;
            return 1;
        } catch (Exception e) {
            System.out.println("e: " + e.getMessage());
            return 0;
        }

    }
}