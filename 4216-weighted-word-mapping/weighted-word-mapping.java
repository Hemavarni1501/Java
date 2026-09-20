class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder a=new StringBuilder();
        for(int i=0;i<words.length;i++){
            int s=0;
            for(int j=0;j<words[i].length();j++){
                int x=words[i].charAt(j)-'a';
                s+=weights[x];
            }
            a.append((char) ('z' - (s % 26)));
        }
        return a.toString();
    }
}