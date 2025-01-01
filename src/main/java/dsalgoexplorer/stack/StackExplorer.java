package dsalgoexplorer.stack;

public class StackExplorer {
    public static void main(String[] args) {
        System.out.println("Stack Implementation");
        KStack<String> stack = new  KStack<String>();
        stack.push("Test");
        stack.push("k2");
        stack.push("300 warriors");
        stack.push("King");

        System.out.println("POPPED: "+stack.pop());
        System.out.println("POPPED: "+stack.pop());
        System.out.println("POPPED: "+stack.pop());
        System.out.println("POPPED: "+stack.pop());
        System.out.println("POPPED: "+stack.pop());
        System.out.println("POPPED: "+stack.pop());
        System.out.println("POPPED: "+stack.pop());

        stack.print();

    }
}
