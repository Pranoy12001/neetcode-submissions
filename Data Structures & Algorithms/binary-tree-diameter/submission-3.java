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
    private int finalDiameter = 0;

    private int calculateDiameter(TreeNode node) {
        if (node == null) return -1;

        int leftHeight = calculateDiameter(node.left);
        int rightHeight = calculateDiameter(node.right);

        finalDiameter = Math.max(finalDiameter, leftHeight + rightHeight + 2);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        calculateDiameter(root);
        return finalDiameter;
    }
}
