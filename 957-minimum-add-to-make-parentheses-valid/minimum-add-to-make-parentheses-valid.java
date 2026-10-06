class Solution {
    public int minAddToMakeValid(String s) {
        int c=0,l=0;
        for(char x:s.toCharArray()){
            if(x=='('){
                c++;
            }else if(c==0){
                l++;
            }else{
                c--;
            }
        }
        return c+l;
    }
}