package binarySearchTree;

import java.util.Scanner;

// size -> Total no of Nodes ;
// Insert go lefr and then insert right ;

public class BinaryTree {

    public BinaryTree() {

    }

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

    }

    private Node root;

    // Insert Element
    public void populate(Scanner sc) {
        System.out.println("Enter the root Node : ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }

    private void populate(Scanner sc, Node node) {
        System.out.println("Do you wann to Insert left of " + node.value);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left of " + node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc , node.left);
        }

        System.out.println("Do you wann to Enter Right of " + node.value);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right of " + node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate( sc, node.right);
        }  
    }

    public void display(){
        display( root , "");
    }

    private void display(Node node, String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + " ");
        display(node.right, indent + "  ");
    }

    public void prettyDisplay(){
        prettyDisplay(root, 0);
    }

    public void prettyDisplay(Node node , int level){
        if(node == null){
            return;
        }

        prettyDisplay(node.right , level + 1);

        if(level != 0){
            for (int i = 0; i <level -1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println(" |-------> " + node.value);

        }else{
            System.out.println(node.value);
        }
        prettyDisplay(node.left , level + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        tree.display();
        tree.prettyDisplay();
    }
}
