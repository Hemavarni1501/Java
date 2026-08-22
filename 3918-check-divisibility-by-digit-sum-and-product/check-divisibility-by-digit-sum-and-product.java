class Solution {
    public boolean checkDivisibility(int n) {
        int t=n, s=0,p=1;
        while(t>0){
            int d=t%10;
            s+=d;
            p*=d;
            t/=10;
        }
        int a=s+p;
        if(n%a==0){
            return true;
        }
        return false;
    }
}