class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0 , j = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] > nums2[j]) j++;
            else if(nums2[j] > nums1[i]) i++;
            else{
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] res = new int[list.size()];
        for(int k=0;k<res.length;k++){
            res[k] = list.get(k);
        }
        return res;
    }
}