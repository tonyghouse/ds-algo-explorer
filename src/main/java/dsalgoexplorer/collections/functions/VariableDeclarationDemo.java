//scope can be simple identified by the paranthesis (from where it starts and where it ends)

//variables declared in the scope can only we accessed in that scope

//declaration is at scope level so. we cant reinitilize a varaible again
// (but we can access and modify the variable in that scope or even inner scopes)
package dsalgoexplorer.collections.functions;
public class VariableDeclarationDemo{

    public static void main (String[] args){
        System.out.println("variable declaration demo");

        int x =10;
        int y= 20;

        {

            // int x=10; //cannot initilize it again as its already initiallized
            int z=30;
             System.out.println("{uno} z: "+z);

             {
        
               z=90;
                System.out.println("{dos} z: "+z);
             }

              System.out.println("{tres} z: "+z);

        }

        int z=-999;

        System.out.println("x: "+x +"  y: "+y +"   z:"+z);
    }
}