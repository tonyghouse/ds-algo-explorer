//package dsalgoexplorer.collections.tree;
//
//import dsalgoexplorer.collections.util.Node;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class TreeTraversals {
//    public static void main(String[] args) {
//        Node dNode = new Node("D", null, null);
//        Node eNode = new Node("E", null, null);
//        Node bNode = new Node("B", dNode, eNode);
//
//        Node fNode = new Node("F", null, null);
//        Node gNode = new Node("G", null, null);
//        Node cNode = new Node("C", fNode, gNode);
//
//        Node root = new Node("A", bNode, cNode);
//
//        // System.out.println("\n\nPRE order tree traversal");
//        // preorder(root);
//        // System.out.print("\n\n IN order tree traversal");
//        // inorder(root);
//        // System.out.println("\n\nPOST order tree traversal");
//        // postorder(root);
//        // int treeSize = size(root);
//        // System.out.println("\n\n SIZE tree: "+treeSize);
//
//        int sumOfNodes = sumOfNodes(root);
//        System.out.println("\n\n SUM of nodes in  tree: " + sumOfNodes);
//
//    }
//
//    // public static void inorder(Node node){
//    // if(node == null){
//    // return ;
//    // }
//    // inorder(node.left);
//    // System.out.print("|"+node.value+"| - ");
//    // inorder(node.right);
//    // }
//
//    // public static void preorder(Node node){
//    // if(node == null){
//    // return ;
//    // }
//
//    // System.out.print("|"+node.value+"| - ");
//    // preorder(node.left);
//    // preorder(node.right);
//    // }
//
//    // public static void postorder(Node node){
//    // if(node == null){
//    // return ;
//    // }
//
//    // postorder(node.left);
//    // postorder(node.right);
//    // System.out.print("|"+node.value+"| - ");
//    // }
//
//    // public static int size(Node node) {
//    // if (node == null) {
//    // return 0;
//    // }
//    // int lCount = size(node.left);
//    // int nodeCount = 1;
//    // int rCount = size(node.right);
//    // return lCount+rCount+nodeCount;
//    // }
//    public static int sumOfNodes(Node node) {
//        if (node == null) {
//            return 0;
//        }
//
//        int lSum = sumOfNodes(node.left);
//        int nodeSum = alphabets.getOrDefault(node.value, 0);
//        int rSum = sumOfNodes(node.right);
//        return lSum + rSum+ nodeSum;
//    }
//
//    public static Map<String, Integer> alphabets = Map.of(
//            "A", 1,
//            "B", 2,
//            "C", 3,
//            "D", 4,
//            "E", 5,
//            "F", 6,
//            "G", 7);
//
//}