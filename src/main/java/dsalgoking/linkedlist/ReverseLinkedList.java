package dsalgoexplorer.linkedlist;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode n5 = new ListNode(5,null);
        ListNode n4 = new ListNode(4,n5);
        ListNode n3 = new ListNode(3,n4);
        ListNode n2 = new ListNode(2,n3);
        ListNode head = new ListNode(1,n2);

        LinkedListBasics.printLL(head);
        ListNode rev = reverseList(head);
        LinkedListBasics.printLL(rev);
    }



    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
