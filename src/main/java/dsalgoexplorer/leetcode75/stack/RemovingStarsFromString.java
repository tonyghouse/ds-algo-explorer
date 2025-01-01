package dsalgoexplorer.leetcode75.stack;

import java.util.Stack;

public class RemovingStarsFromString {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        String result = removeStars(s);
        System.out.println("Result: "+result);

    }

    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '*'){
                stack.pop();
            }else{
                stack.push(c);
            }
        }


        StringBuilder sb = new StringBuilder();
        for(char c: stack){
            sb.append(c);
        }
        return sb.toString();
    }
}
