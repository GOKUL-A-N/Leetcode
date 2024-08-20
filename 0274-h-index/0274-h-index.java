class Solution {
    public int hIndex(int[] citations) {
        int h = citations.length, maximum = 0;
        Arrays.sort(citations);
        for(int i=0;i<citations.length;i++){
            if(citations[i] >= h-i){
                maximum = Math.max(maximum,h-i);
            }
        }
        return maximum;
    }
}