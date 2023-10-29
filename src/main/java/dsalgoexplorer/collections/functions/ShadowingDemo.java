package dsalgoexplorer.collections.functions;
public class ShadowingDemo{

   
    //process of using two variables with same name in overlapping scopes.
    //reinitialization of variable in inner scope is allowed

     static int x =100;


    public static void main(String[] args) {
      System.out.println("main{1} block X: "+x);


      int x=-999; //class variable is shadowed here
       System.out.println("\nmain{2} block X: "+x);
      x=786;
      subMethod();
       System.out.println("\nmain{3} block X: "+x);
       

      subMethod();

    }

    static void subMethod(){
        
         System.out.println("sub method block X: "+x);
    }
}