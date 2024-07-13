class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int n:nums1) set.add(n);
        for(int n:nums2){
            if(set.contains(n) && !list.contains(n)) list.add(n);
        }
        int[] res = new int[list.size()];
        for(int i=0;i<list.size();i++) res[i] = list.get(i);
        return res;
    }
}