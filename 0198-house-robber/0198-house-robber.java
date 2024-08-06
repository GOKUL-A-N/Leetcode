class Solution {
    public int rob(int[] nums) {
        int odd = 0;
        int even = 0;
        for(int i=0;i<nums.length;i++){
            if(i % 2 == 0) odd += nums[i];
            else even += nums[i];
        }
        return (odd > even) ? odd : even;
    }
}