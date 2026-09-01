class Solution {
    public String convert(String s, int n) {
        if(n==1||n>s.length()){
            return s;
        }
        String[] a=new String[n];
        for(int i=0;i<n;i++){
            a[i]="";
        }
        int l=2*n-2;
        for(int i=0;i<s.length();i++){
            int p=i%l;
            int row;
            if(p<n){
                row=p;
            }else{
                row=l-p;
            }
            a[row]+=s.charAt(i);
        }
        String result="";
        for(int i=0;i<n;i++){
            result+=a[i];
        }
        return result;
    }
}