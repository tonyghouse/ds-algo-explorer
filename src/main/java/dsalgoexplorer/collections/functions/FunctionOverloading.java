package dsalgoexplorer.collections.functions;

public class FunctionOverloading{


    public static void main(String[] args){
        display(11);
        display("ghouse");
        display(999);
    }

    static void display(int n){
        System.out.println("displaying num : "+n);
    }

     static void display(String s ){
        System.out.println("displaying str: "+s);
    }
}