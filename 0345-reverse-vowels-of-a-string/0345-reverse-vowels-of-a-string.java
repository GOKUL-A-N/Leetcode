class Solution {
    public String reverseVowels(String s) {
        int l=0,r=s.length()-1;
        char[] arr = s.toCharArray();
        while(l<r){
            while(l<r && !isVowel(arr[l])){
                l++;
            }while(l<r && !isVowel(arr[r])) r--;
            if(l<r){
                char a = arr[l];
                arr[l] = arr[r];
                arr[r] = a;
                l++;
                r--;
            }
        }
        return new String(arr);
    }
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}