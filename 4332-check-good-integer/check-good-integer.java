class Solution {
    public boolean checkGoodInteger(int n) {
        int s=0, sq=0;
        while(n>0){
            int d=n%10;
            s+=d;
            sq+=d*d;
            n/=10;
        }
        if((sq-s)>=50){
            return true;
        }
        return false;
    }
}