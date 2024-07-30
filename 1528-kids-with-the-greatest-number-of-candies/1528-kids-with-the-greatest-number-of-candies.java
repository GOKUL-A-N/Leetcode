class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest = -1;
        List<Boolean> list = new ArrayList<>();
        for(int c:candies){
            greatest = Math.max(greatest,c);
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >= greatest) list.add(true);
            else list.add(false);
        }
        return list;
    }
}