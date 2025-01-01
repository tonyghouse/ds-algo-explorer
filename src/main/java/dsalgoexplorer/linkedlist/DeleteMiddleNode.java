package dsalgoexplorer.linkedlist;

class DeleteMiddleNode {

    public static void main(String[] args) {
//        ListNode n6 = new ListNode(6,null);
        ListNode n5 = new ListNode(5,null);
        ListNode n4 = new ListNode(4,n5);
        ListNode n3 = new ListNode(3,n4);
        ListNode n2 = new ListNode(2,n3);
        ListNode head = new ListNode(1,n2);
        deleteMiddle(head);
        LinkedListBasics.printLL(head);



    }

    public static ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode mid;
        ListNode prevMid = null;
        while(fast != null && fast.next != null){
            prevMid = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        mid = slow;
        prevMid.next = mid.next;

        return head;
    }
}