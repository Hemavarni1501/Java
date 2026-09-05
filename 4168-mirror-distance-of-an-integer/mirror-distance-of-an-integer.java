class Solution {
    public int mirrorDistance(int n) {
        int t=n; int r=0;
        if(n%10==n){
            return 0;
        } 
        while(t>0){
            int d=t%10; 
            r=(r*10)+d;
            t/=10;
        }
        return Math.abs(n-r);
    }
}