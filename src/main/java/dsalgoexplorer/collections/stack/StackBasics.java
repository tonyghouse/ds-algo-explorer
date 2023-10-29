import java.util.Stack;

public class StackBasics{
    public static void main(String[] args) {
        Stack<Integer> st  = new Stack<>();

        st.push(10080);
        st.push(333);
        st.push(919);

        System.out.println(st.peek());
    }
}