class Solution {
    public int lengthOfLastWord(String s) {
        int c=0;
        int i=s.length()-1;
        while(s.charAt(i)==' '){
            i--;
        }
        if(i==0){
            return 1;
        }
       while(s.charAt(i)!=' '){
        if(i==0){
            return c+1;
        }
        i--;
        c++;
       }
       return c; 
    }
}