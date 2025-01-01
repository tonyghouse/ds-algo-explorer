package dsalgoking.linkedlist;

class OddEvenLinkedList {
    public static void main(String[] args) {
       ListNode n7 = new ListNode(7,null);
       ListNode n6 = new ListNode(6,n7);
        ListNode n5 = new ListNode(5,n6);
        ListNode n4 = new ListNode(4,n5);
        ListNode n3 = new ListNode(3,n4);
        ListNode n2 = new ListNode(2,n3);
        ListNode head = new ListNode(1,n2);
        oddEvenList(head);

    }

    public static ListNode oddEvenList(ListNode head) {
        if(head == null){
            return head;
        }
        if(head.next ==null){
            return head;
        }

        ListNode oddMain = head;
        ListNode odd = head;
        ListNode evenMain = head.next;
        ListNode even = head.next;

        while(odd!=null && odd.next!=null  && even !=null && even.next!=null){
            odd.next = odd.next.next;
            odd = odd.next;

            even.next = even.next.next;
            even = even.next;
        }
        odd.next = evenMain;

        head  = oddMain ;
        return head;
    }
}