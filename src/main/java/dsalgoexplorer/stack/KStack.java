package dsalgoexplorer.stack;

import java.util.Arrays;

public class KStack<T> {

    int top = 0;
    int capacity = 3;
    T[] arr = (T[]) new Object[capacity];
    public void push(T i) {
        if(size() == capacity){
            expandStack();
        }
        arr[top] = i;
        top++;
    }

    private void expandStack() {
        int newCap = capacity*2;
        capacity = newCap;
        T[] newArr = (T[]) new Object[newCap];

        for(int i=0; i<size() ;i++){
            newArr[i] = arr[i];
        }
        arr = newArr;

    }

    public T pop() {
        if(top-1 < 0){
            return null;
        }

        T val = arr[top-1];
        arr[top-1] = null;
        top-- ;
        return val;
    }

    public T peek() {
        return arr[top-1];
    }

    public int size(){
        return top;
    }



    public  void print(){
        System.out.println("Top@"+top
                + "-Stack: "+ Arrays.toString(arr));
    }

}
