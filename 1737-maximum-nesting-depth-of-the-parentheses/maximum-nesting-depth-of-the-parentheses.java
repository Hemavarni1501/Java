class Solution {
    public int maxDepth(String s) {
        int c=0,m=0;
        for(char x:s.toCharArray()){
            if(x=='('){
                c++;
            }else if(x==')'){
                c--;
            }
            m=c>m?c:m;
        }
        return m;
    }
}