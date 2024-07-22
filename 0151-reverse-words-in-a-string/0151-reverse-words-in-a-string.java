class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        s= s.replaceAll("\\s+", " "); 
        String[] res = s.split(" ");
        for(int i=0,j=res.length-1;i<res.length/2;i++,j--){
            String temp = res[i];
            res[i] = res[j];
            res[j] = temp;
        }
        StringBuilder sentence = new StringBuilder();
        for(String n:res){
            sentence.append(n);
            sentence.append(" ");
        }
        return sentence.toString().trim();
    }
}