/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    private int height(TreeNode node) {
        return node == null ? 
        -1 : Math.max(height(node.left), height(node.right)) + 1;
    }

    private int calculateDiameter(TreeNode node) {
        if (node == null) return 0;

        int leftDiameter = calculateDiameter(node.left);
        int rightDiameter = calculateDiameter(node.right);

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int rootDiameter = leftHeight + rightHeight + 2;

        return Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));
    }

    public int diameterOfBinaryTree(TreeNode root) {
        return calculateDiameter(root);
    }
}
