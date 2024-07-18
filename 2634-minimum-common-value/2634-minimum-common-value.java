class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        for(int n:nums1){
            for(int i=0;i<nums2.length && nums2[i]<=n;i++){
                if(nums2[i] == n) return n;
            }
        }
        return -1;
    }
}