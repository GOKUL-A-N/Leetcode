class Solution {
    public int subsetXORSum(int[] nums) {
        return dfs(nums,0,0);
    }
    private int dfs(int[] nums,int i,int curr){
        if(i >= nums.length) return curr;

        int with = dfs(nums,i+1,curr ^ nums[i]);

        int without = dfs(nums,i+1,curr);

        return with + without;
    }
}