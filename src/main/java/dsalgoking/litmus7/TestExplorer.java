package dsalgoking.litmus7;

public class TestExplorer {

    /*
    Q4- Implement a stack using a singly linked list with operations: push, pop, and peek.
    Q5- Write a function to sort a stack such that the smallest items are on the top. You can use an additional temporary stack but you cannot use any other data structure.
     */
    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push("test1");
//      System.out.println(stack.peek());
        System.out.println(stack.pop());
        if(!stack.isEmpty()){
            System.out.println(stack.peek());
        }
        System.out.println(stack.isEmpty());
    }
}
