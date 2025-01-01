package dsalgoking.litmus7;

import java.util.LinkedList;

public class Stack {
    private LinkedList<String> list;
    public Stack(){
        list = new LinkedList<>();
    }


    public void push(String value){
        //push on top
        list.add(value);
    }

    public String pop(){
        //remove from last
        return list.removeLast();
    }

    public String peek(){
        //don't remove just return;
        return list.getLast();
    }

    public boolean isEmpty(){
        int size = list.size();
        return size<=0;
    }




}
