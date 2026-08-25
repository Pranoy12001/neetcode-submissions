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
    public int diameterOfBinaryTree(TreeNode root) {
        TreeAnalyser treeAnalyser = new TreeAnalyser();
        return treeAnalyser.getDiameter(root);
    }
}

class TreeAnalyser {
    private int finalDiameter = 0;

    public int getDiameter (TreeNode node) {
        calculateHeight(node);
        return finalDiameter;
    }
    
    private int calculateHeight(TreeNode node) {
        if (node == null) return -1;

        int leftHeight = calculateHeight(node.left);
        int rightHeight = calculateHeight(node.right);

        finalDiameter = Math.max(finalDiameter, leftHeight + rightHeight + 2);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
