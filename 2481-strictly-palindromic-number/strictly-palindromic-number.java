class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            int a=n;
            ArrayList<Integer> l=new ArrayList<>();
            while(a>0){
                int r=a%i;
                l.add(r);
                a/=i;
            }
            ArrayList<Integer> rev=new ArrayList<>(l);
            Collections.reverse(rev);
            if(!l.equals(rev)){
                return false;
            }
        }
        return true;
    }
}