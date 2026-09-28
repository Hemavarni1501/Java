class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int c=0,m=0;
        for(char x:s.toCharArray()){
            if(x=='('){
                st.push('(');
                c++;
            }else if(x==')'){
                c--;
                st.pop();
            }
            m=c>m?c:m;
        }
        return m;
    }
}