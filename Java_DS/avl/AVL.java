package avl;
// height is always equal to less or equal of >=1
// height => edges
public class AVL {

    public AVL(){}

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

    public int height() {
        return height(root);
    }

    public int height(Node node){
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(root , "Root Node : ");
    }

    public void display(Node node ,String details){
        if(node == null){
            return;
        }

        System.out.println(details + node.getValue());

        display(node.left , "Left child of " + node.getValue() + " : ");
        display(node.right , "Right child of " + node.getValue() + " : ");
    }


    public void insert(int value){
        root = insert(value, root);
    }


    public Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }

        if(value < node.value){
            node.left = insert(value , node.left);
        }

        if(value > node.value){
            node.right = insert(value , node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) +1;
        
        return rotate(node);
    }

    private Node rotate(Node node){

        if(height(node.left) - height(node.right) > 1){
            //left heavy

            if(height(node.left.left) - height(node.left.right) > 0 ){
                // left left
                return rightRotate(node);
            }

            if(height(node.left.left) - height(node.left.right) > 0){
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }


        if(height(node.left) - height(node.right) < -1){
            //left heavy

            if(height(node.right.left) - height(node.right.right) < 0 ){
                // right
                return leftRotate(node);
            }

            // right left
            if(height(node.right.left) - height(node.right.right) > 0){
                node.left = rightRotate(node.left);
                return leftRotate(node);
            }
        }

        return node;
    }

    public Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = p ;
        p.left = t;


        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return c;
    }


    public Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;


        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return p;
    }




    public void populate(int[] num){
        for (int i = 0; i < num.length; i++) {
            insert(num[i]);
        }
    }

    public void populatedSorted(int[] nums){
        populatedSorted(nums, 0, nums.length);
    }

    public void populatedSorted(int nums[], int start , int end){
        if(start >=end){
            return;
        }
        int mid = (start + end)/2;

        this.insert(nums[mid]);

        populatedSorted(nums, start , mid);
        populatedSorted(nums, mid+1 , end);
    }
    
    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 
        && balanced(node.left) && balanced(node.right);
    }
    public static void main(String[] args) {
        AVL avl = new AVL();
        

        for(int i = 0 ; i < 100 ; i++){
            avl.insert(i);
        }

        System.out.println(avl.height());
    }
}
