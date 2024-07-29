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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        String str = new String();
        dfs(root,res,str);
        return res;
    }

    private void dfs(TreeNode root,List<String> res,String str){
        if(root == null) return;
        if(root.left == null && root.right == null){
            str = str + root.val;
            res.add(str);
            return;
        }
        str = str + root.val + "->";
        dfs(root.left,res,str);
        dfs(root.right,res,str);
    }
}