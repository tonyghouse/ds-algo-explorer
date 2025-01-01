package dsalgoexplorer.linkedlist;

public class Node {
    public Integer data;
    public Node next;

    public Node(Integer data, Node next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        Integer nextData = next != null ? next.data : null;
        return "[" + data + "]" + "-->" + "/" + nextData + "/";
    }

}
