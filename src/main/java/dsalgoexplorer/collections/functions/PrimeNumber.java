package dsalgoexplorer.collections.functions;
import java.util.Scanner;
import java.lang.Math;
public class PrimeNumber{

    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int num = scan.nextInt();
       boolean isPrime = checkPrime(num);

       System.out.println("number: "+num +" is prime: "+isPrime);


    }

    private static boolean checkPrime(int num){
        if(num<=1){
            return false;
        }
       
       int c=1;
        while( c < Math.sqrt(num)){
            if(num%c==0){
                return false;
            }
            c++;
        }

        return true;
    }
}