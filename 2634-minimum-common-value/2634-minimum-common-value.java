class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int n:nums1){
            set.add(n);
        }
        for(int n:nums2){
            if(set.contains(n)) return n;
        }
        return -1;
    }
}