package dsalgoexplorer.leetcode75.arraysandstrings;

public class RevWordsString {
    public static void main(String[] args) {
        String s = "a good   example";
        String result = reverseWords(s);
        System.out.println("Result: ["+result+"]");
    }


    public static String reverseWords(String s) {
        String[] arr = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int j=arr.length-1; j>=0; j--){
            if(!arr[j].isBlank()){
                sb.append(arr[j]);
                sb.append(" ");
            }
        }

        return sb.toString().strip();

    }

}
