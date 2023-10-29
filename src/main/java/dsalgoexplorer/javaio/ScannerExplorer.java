import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerExplorer{
    public static void main(String[] args) throws IOException{
        System.out.println("exploring scanner class ");

        // |#1 old way of reading and writing|
        // System.out.print("Enter a number: ");
        // //gives one character at a time in ASCII
        // int num = System.in.read(); 
        // System.out.println("number: "+num);


        // |#2 using buffered reader|
        // InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        // BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        // System.out.print("Enter a number: ");
        // String num = bufferedReader.readLine();
        // System.out.println("number: "+num);

        // |#3 Scanner class|
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = scanner.next();
        System.out.println("number: "+num);
        scanner.close();
       


    }

   
}