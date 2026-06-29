package tree;

import java.util.HashSet;

public class TwoSum {

    /**
     * TreeNode
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        public TreeNode(int val){
            this.val = val;

        }
    }

    public boolean findTarget(TreeNode root , int k){
        HashSet<Integer> set = new HashSet<>();
        return helper(root , k , set);
    }

    private boolean helper(TreeNode node ,int k , HashSet<Integer> set){

        if(node == null){
            return false;
        }

        if(set.contains(k - node.val)){
            return true;
        }

        set.add(node.val);

        return helper(node.left, k, set) || helper(node.right, k, set);
        
    }

    


    public static void main(String[] args) {
        TwoSum obj = new TwoSum();

    // Create the tree
    TreeNode root = obj.new TreeNode(5);
    root.left = obj.new TreeNode(3);
    root.right = obj.new TreeNode(6);
    root.left.left = obj.new TreeNode(2);
    root.left.right = obj.new TreeNode(4);
    root.right.right = obj.new TreeNode(7);

    int k = 9;

    System.out.println(obj.findTarget(root, k)); // true
    }
}
