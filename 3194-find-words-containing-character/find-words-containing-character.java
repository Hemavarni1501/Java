class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> a=new ArrayList<>();
        String y="";
        y+=x;
        for(int i=0;i<words.length;i++){
            if(words[i].contains(y)){
                a.add(i);
            }
        }
        return a;
    }
}