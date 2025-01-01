public class SubStringCyclicalInc {
    public static void main(String[] args) {
        int val = "a".charAt(0);
        System.out.println("char test : "+Math.round(2.5));

        String str1="aomkc";
        String str2="bc";

        boolean result = canMakeSubsequence(str1,str2);
        System.out.println("result: "+result);
        
    }
    

    static public boolean canMakeSubsequence(String str1, String str2) {
        int j = 0;


        //parse till all elements in j are checked
        for ( int i = 0; (i < str1.length() && j < str2.length()); i++ ){
            
            int a = str1.charAt(i);
            int b = str2.charAt(j);

            //check for conditions
            if ( a == b || a + 1 == b || a - 25 == b){
                j++;
            }
        }
  

        //all chars in str2 matched?
        return j == str2.length();
    }
    
}
