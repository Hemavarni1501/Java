class Solution {
    public int arrangeCoins(int n) {
        if(n==1){
            return 1;
        }
        int c=0,s=n;
        for(int i=1;i<n;i++){
            if(s<i){
                break;
            }
            s-=i; c++;
        }
        return c;
    }
}