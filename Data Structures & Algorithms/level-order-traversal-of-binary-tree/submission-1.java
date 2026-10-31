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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        levelOrder(root, ans);
        return ans;
    }

    private void levelOrder(TreeNode root, List<List<Integer>> res) {
        Queue<TreeNode> nodeQueue = new LinkedList<>();

        nodeQueue.add(root);

        while (!nodeQueue.isEmpty()) {
            List<Integer> list = new ArrayList<>();

            for (int i = nodeQueue.size(); i > 0; i--) {
                TreeNode node = nodeQueue.poll();

                if (node != null) {
                    list.add(node.val);
                    nodeQueue.add(node.left);
                    nodeQueue.add(node.right);
                }
            }

            if (list.size() > 0) {
                res.add(list);
            }
        }
    }
}
