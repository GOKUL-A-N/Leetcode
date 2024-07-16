class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double minAvg = Double.MAX_VALUE;
        int l=0,r=(nums.length)-1;
        while(l<r){
            double min = (double)(nums[l]+nums[r])/2;
            minAvg = Math.min(min,minAvg);
            l++;
            r--;
        }
        return minAvg;
    }
}