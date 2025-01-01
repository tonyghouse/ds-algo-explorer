package dsalgoexplorer.linkedlist;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LinkedListBasics {
    public static void main(String[] args) {
        ListNode listNode3 = new ListNode(3, null);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);
        ListNode head = new ListNode(0, listNode1);


//        traverseLLNodes(head);
    }


    public static void printLL(ListNode head) {
        ListNode temp =head;
        while(temp!=null){
            System.out.print(temp.data +" -> ");
            temp = temp.next;

        }
        System.out.print("null");
        System.out.println();
    }

    private static void traverseLLNodes(ListNode head) {
        ListNode temp = head;
        while(temp!=null){
            System.out.print("("+temp.data+")->");
            temp = temp.next;
        }
    }
}


