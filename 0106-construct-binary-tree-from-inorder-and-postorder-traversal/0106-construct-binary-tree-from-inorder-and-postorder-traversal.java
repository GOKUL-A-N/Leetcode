class Solution {
    
    int index;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        index = postorder.length-1;
        return buildTree(inorder, postorder, 0, inorder.length-1);
    }

    public TreeNode buildTree(int[] inorder, int[] postorder, int start, int end) {
        if(start > end) return null;
    
        int nodeVal = postorder[index--];
        int inorderNodeIndex = findInorderNodeIndex(inorder, start, end, nodeVal);
    
        TreeNode root = new TreeNode(nodeVal);
        root.right = buildTree(inorder, postorder, inorderNodeIndex+1, end);
        root.left = buildTree(inorder, postorder, start, inorderNodeIndex-1);
        return root;
    }

    public int findInorderNodeIndex(int[] inorder, int start, int end, int nodeVal) {
        for(int i=start;i<=end;i++) {
            if(inorder[i] == nodeVal) return i;
        }
        return -1;
    }
}