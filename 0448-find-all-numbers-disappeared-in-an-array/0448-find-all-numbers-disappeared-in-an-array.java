class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        Set<Integer> list = new HashSet<>();
        for(int n:nums) list.add(n);
        for(int i=1;i<=nums.length;i++){
            if(!list.contains(i)) res.add(i);
        }
        return res;
    }
}