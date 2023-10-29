package dsalgoexplorer.collections.linkedList;

import dsalgoexplorer.collections.util.Node;

import java.util.*;

public class LinkedListBasics {
    public static void main(String[] args) {

        Node n4 = new Node(400, null);
        Node n3 = new Node(300, n4);
        Node n2 = new Node(200, n3);
        Node n1 = new Node(100, n2);

        Node head = n1;

        // print(head);
        // printRev(head);

        // new node
        Node n5 = new Node(786, null);
        // #1 add new element at start
        // head = addAtStart(head, n5);

        // #2 add new element at end
        // head = addAtLast(head, n5);

        // #3 add element at an index start
        // head = addAtIndex(head, n5, 2);

        // #4 remove element from first
        // head = removeFromFirst(head);

        // #5 remove element from last
        // head = removeFromLast(head);

        // #6 lenght of LL
        // int lengthOfLL = getLength(head);
        // System.out.println("lenght of LL : "+lengthOfLL);

        // #7 mid of LL
        print(head);
        Node mid = getMidOfLL(head);
        System.out.println("mid of LL : "+mid);



    }

  
  

   



    public static void print(Node node) {
        if (node == null) {
            return;
        }
        System.out.println("|" + node.value + "|");
        print(node.next);
    }

    public static void printRev(Node node) {
        if (node == null) {
            return;
        }
        printRev(node.next);
        System.out.println("|" + node.value + "|");
    }

    private static Node addAtStart(Node head, Node newNode) {
        newNode.next = head;
        head = newNode;

        return head;
    }

    private static Node addAtLast(Node head, Node newNode) {
        // traverse till you find the last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        // System.out.println("last node: "+temp);
        temp.next = newNode;

        return head;
    }

    // edge case of starting element is missed
    private static Node addAtIndex(Node head, Node newNode, int idx) {
        Node temp = head;

        int tempIdx = 0;

        for (int i = 0; i < idx; i++) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        // System.out.println("pointed node: " + temp);

        Node nextNodeRef = temp.next;
        newNode.next = nextNodeRef;
        temp.next = newNode;

        return head;
    }

    private static Node removeFromFirst(Node head) {
        if (head == null) {
            return null;
        }
        Node temp = head;
        head = temp.next;
        return head;
    }

      private static Node removeFromLast(Node head) {
          if (head == null) {
            return null;
        }
        Node temp = head;

        while(temp.next!=null && temp.next.next !=null){   
            temp = temp.next;
        }

        // System.out.println("pen ultimate node: "+temp);
        temp.next = null;
        return head;
    }

      private static int getLength(Node head) {
        int count =0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }


     private static Node getMidOfLL(Node head) {
        Node temp = head;
        Node sp = temp;
        Node fp =temp;

        while(fp.next!=null && fp.next.next!=null){
            sp = sp.next;
            fp = fp.next.next;
        }

        

        return sp;
    }



}

