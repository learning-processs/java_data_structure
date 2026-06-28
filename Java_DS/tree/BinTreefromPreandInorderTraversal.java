package tree;

import java.util.HashMap;

public class BinTreefromPreandInorderTraversal {

    static int index = 0;

    TreeNode buildTree(int[] preOrder, int[] inOrder) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inOrder.length; i++) {
            map.put(inOrder[i], i);
        }

        index = 0;

        return helper(preOrder, 0, inOrder.length - 1, map);
    }

    public static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode helper(int[] preOrder, int left, int right, HashMap<Integer, Integer> map) {

        if (left > right)
            return null;

        int rootVal = preOrder[index++];
        TreeNode root = new TreeNode(rootVal);

        if (left == right)
            return root;

        int mid = map.get(rootVal);

        root.left = helper(preOrder, left, mid - 1, map);
        root.right = helper(preOrder, mid + 1, right, map);

        return root;
    }

    public static void main(String[] args) {
        BinTreefromPreandInorderTraversal obj = new BinTreefromPreandInorderTraversal();

        int[] preorder = { 3, 9, 20, 15, 7 };
        int[] inorder = { 9, 3, 15, 20, 7 };

        TreeNode root = obj.buildTree(preorder, inorder);

        System.out.println("Inorder of constructed tree:");
        obj.printInorder(root);
    }

    private void printInorder(TreeNode root) {
        if (root == null)
            return;

        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }
}
