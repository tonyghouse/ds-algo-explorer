package dsalgoking.leetcode75.arraysandstrings;

public class GCDOfStrings {
    public static void main(String[] args) {
        String str2= "ABDABD";
        String str1 = "ABD";

        String result = gcdOfStrings(str1,str2);
        System.out.println("\n\n\n Result: "+result);
    }

    public static String gcdOfStrings(String str1, String str2) {
//        System.out.println("ITER---> str1: "+str1 +" str2: "+str2);
        if(str1.equals(str2)){
            return str1;
        }

        //important condition
        if(str2.length() > str1.length()){
            return gcdOfStrings(str2,str1);
        }

        if(str1.startsWith(str2)){
            return gcdOfStrings(str1.substring(str2.length()),str2);
        }

        return "";
    }

}
