package binarySearchTree;

// Pre - Order Traversal :  Node -> left -> right
// Inorder : left -> Node -> right ( sorted )
// Post - order :left-> right  -> Node
// BFS & DFS AND BFT & DFT

public class TraversalMethod {

    public class Node {
    
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value){
            this.value = value;
        }

        // public Node(int value, Node left, Node right){
        //     this.value = value;
        //     this.left = left;
        //     this.right = right;
        // }  

        public int getValue(){
            return value;
        }
    }

    private Node root;

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insert(node.left, value);
        } else {
            node.right = insert(node.right, value);
        }

        return node;
    }

    private void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node node){
        if(node == null){
            return;
        }

        System.out.println(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    private void inOrder(){
        preOrder(root);
    }

    private void inOrder(Node node){
        if(node == null){
            return;
        }

        preOrder(node.left);
        System.out.println(node.value + " ");
        preOrder(node.right);
    }


    private void postOrder(){
        preOrder(root);
    }

    private void postOrder(Node node){
        if(node == null){
            return;
        }

        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.value + " ");
    }


    public static void main(String[] args) {
        TraversalMethod tm = new TraversalMethod();

        int arr[] = {10, 5, 15, 3, 7, 12, 18};

        for(int value : arr){
            tm.insert(value);
        }

        System.out.print("Preorder: ");
        tm.preOrder(tm.root);

        System.out.print("\nInorder: ");
        tm.inOrder(tm.root);

        System.out.print("\nPostorder: ");
        tm.postOrder(tm.root);
    }
}
