package dsalgoexplorer.collections.functions;
public class PassValueDemo{

    public static void main(String[] args){

        String name = "arjun";

        System.out.println("main function uno: "+name);
      
        name=swapName2(name);
        
        System.out.println("main function dos: "+name);


        // Voter voter1 = new Voter("krishna",25);

        // System.out.println("voter details UNO: "+voter1.getName()+"   "+voter1.getVid());

        





    }

    static void swapName1(String name){
          name = "khan";
          System.out.println("inside swap1: "+name);
    }

     static String swapName2(String name){
          name = "khan";
          System.out.println("inside swap1: "+name);
          return name;
    }

     class Voter{
        private String name;
        private int vid;

        public Voter(){

        }

        public Voter(String name,int vid){
            this.name=name;
            this.vid=vid;
        }

        public void setName(String name){
            this.name=name;
        }

        public void setVid(int vid){
            this.vid=vid;
        }

        public String getName(){
            return name;
        }

        public int getVid(){
            return vid;
        }

        
    }


}