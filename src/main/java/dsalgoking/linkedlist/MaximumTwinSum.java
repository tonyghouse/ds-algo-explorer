package dsalgoking.linkedlist;

public class MaximumTwinSum {
    public static void main(String[] args) {
//        ListNode n6 = new ListNode(6,null);
//        ListNode n5 = new ListNode(5,n6);
        ListNode n4 = new ListNode(3, null);
        ListNode n3 = new ListNode(2, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode head = new ListNode(4, n2);

//        LinkedListBasics.printLL(head);
        int result = pairSum(head);
        System.out.println("result: " + result);
    }

    public static int pairSum(ListNode head) {
        return 0;
    }
}
