class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,l=nums.length-1;
        while(i<l){
            if(nums[i] + nums[l] == target) return new int[]{i+1,l+1};
            else if(nums[i]+nums[l] > target) l--;
            else i++;
        }
        return new int[]{-1,-1};
    }
}