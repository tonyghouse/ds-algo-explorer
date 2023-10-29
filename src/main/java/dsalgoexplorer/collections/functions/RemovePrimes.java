package dsalgoexplorer.collections.functions;
import  java.util.*;

public class RemovePrimes {
    public static void main(String[] args) {
    //   int[] A = new int[] {728, 556, 783, 501, 768, 335, 641, 378, 745, 281, 768, 359, 896, 173, 329, 271, 658, 260, 528, 782, 381, 868, 866, 376, 227};
      
       int[] A = new int[] {728};
      
      List<Integer> list = new ArrayList<Integer>();

        for(int j=A.length-1 ; j>=0 ; j--){
            int num = A[j];
            boolean numPrime = isPrime(num);
            System.out.println("Num: "+num +"  prime: "+numPrime);
            if(!numPrime){
             list.add(num);
            }
        }

         System.out.println(list.toString());


    }


  static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
       for(int i=2;i<=num/2;i++)
       {
           if((num%i)==0)
               return  false;
       }
       return true;
    }
}
