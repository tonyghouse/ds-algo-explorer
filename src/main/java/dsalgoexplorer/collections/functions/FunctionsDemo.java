package dsalgoexplorer.collections.functions;
import java.util.Scanner;
/*
functions- block of code/collection of statements that performs certain task/operation

*/

public class FunctionsDemo{
	public static void main(String[] args){
	 System.out.println("Variable declaration demo");

	 Scanner scan = new Scanner(System.in);
	 System.out.print("enter num1:");
	 int num1 = scan.nextInt();

     System.out.print("enter num2: ");
	 int num2 = scan.nextInt();

	 System.out.println("Sum : "+num1+num2);

	 test1();


	}


	   static public void test1(){
		System.out.println("test1 method");

	}
}