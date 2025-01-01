package dsalgoking.linkedlist;

public class ListNode {
    public Integer data;
    public ListNode next;

    public ListNode(Integer data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        Integer nextData = next != null ? next.data : null;
        return "[" + data + "]" + "-->" + "/" + nextData + "/";
    }

}
