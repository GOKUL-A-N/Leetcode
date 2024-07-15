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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        return dfs(root,list,k);
    }

    private boolean dfs(TreeNode root , List<Integer> list, int target){
        if(root == null) return false;

        if(list.contains(target - root.val)) return true;

        list.add(root.val);

        return dfs(root.left,list,target) || dfs(root.right,list,target);
    }
}