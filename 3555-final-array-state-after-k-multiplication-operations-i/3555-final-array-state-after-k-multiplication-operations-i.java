class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0;i<k;i++){
            int index = findMinIndex(nums);
            nums[index] *= multiplier;
        }
        return nums;
    }
    private int findMinIndex(int[] nums){
        int minIndex = nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[minIndex] >= nums[i]){
                minIndex = i;
            }
        }
        return minIndex;
    }
}