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
    private int[] calculateDiameter(TreeNode node) {
        if (node == null) return new int[]{0, -1};

        int[] leftRes = calculateDiameter(node.left);
        int[] rightRes = calculateDiameter(node.right);

        int[] result = new int[2];

        result[0] = Math.max(Math.max(leftRes[0], rightRes[0]), leftRes[1] + rightRes[1] + 2);
        result[1] = Math.max(leftRes[1], rightRes[1]) + 1;

        return result;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        return calculateDiameter(root)[0];
    }
}
