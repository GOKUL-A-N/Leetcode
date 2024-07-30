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
    public int findSecondMinimumValue(TreeNode root) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        dfs(root,q);
        q.poll();
        return (!q.isEmpty()) ? q.poll() : -1;
    }

    private void dfs(TreeNode root,PriorityQueue<Integer> q){
        if(root==null) return;
        if(!q.contains(root.val)) q.offer(root.val);
        dfs(root.left,q);
        dfs(root.right,q);
    }
}