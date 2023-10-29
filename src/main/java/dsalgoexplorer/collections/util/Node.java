package dsalgoexplorer.collections.util;

public class Node {
    public int value;

    public Node next;

    public Node() {

    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return this.value;
    }

    public Node getNext() {
        return this.next;
    }

    @Override
    public String toString() {
        return "[<" + String.valueOf(this.value) + ">]";
    }

}