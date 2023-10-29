package dsalgoexplorer.collections.functions;
import java.util.Arrays;
public class VarargsDemo{
    public static void main (String[] args){


      display(1,2,3,4);
      display("king","queen","minister");

      //display(); //ERROR :ambiguity
    }

    static void display(int... nums){
        System.out.println("displaying nums: "+ Arrays.toString(nums));
    }

    static void display(String... strs){
        System.out.println("displaying strs: "+Arrays.toString(strs));
    }

    
}