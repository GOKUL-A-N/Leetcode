class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(containsLetter(words[i],x)) list.add(i);
        }
        return list;
    }
    private boolean containsLetter(String word,char letter){
        for(int i=0;i<word.length();i++){
            if(word.charAt(i) == letter) return true;
        }
        return false;
    }
}