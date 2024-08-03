class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length != arr.length) return false;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<target.length;i++){
            list.add(target[i]);
        }
        for(int s:arr){

            list.remove(Integer.valueOf(s));
        }
        return list.size() == 0;
    }
}