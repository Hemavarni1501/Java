class Solution {
    public int maxScore(int[] c, int k) {
        int n=c.length;
        int s=0;
        for(int x:c){
            s+=x;
        }
        if (k == n) {
            return s;
        }
        int w=n-k;
        int co=0;
        for(int i=0;i<w;i++){
            co+=c[i];
        }
        int max=co;
        for(int i=w;i<n;i++){
            co+=c[i]-c[i-w];
            max=Math.min(max,co);
        }
        return s-max;
    }
}