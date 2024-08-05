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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        for(int i=0;i<preorder.length;i++){
            pre.add(preorder[i]);
            in.add(inorder[i]);
        }
        return dfs(pre,in);
    }
    private TreeNode dfs(List<Integer> pre,List<Integer> in){
        if(in.size() >0){
            int index = in.indexOf(pre.remove(0));

            TreeNode root = new TreeNode(in.get(index));
            root.left = dfs(pre,in.subList(0,index));
            root.right = dfs(pre,in.subList(index+1,in.size()));

            return root;
        }
        return null;
    }
}