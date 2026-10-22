class Solution {
    public int mySqrt(int x) {
        int mid,high=x,low=0;
        if(x==0||x==1){
            return x;
        }
        else{
        while(low<=high){
            mid=(low+high)/2;
            if((long)mid*mid==x){
                return mid;
            }
            else if((long)mid*mid < x){
                low=mid+1;;
            }
            else{
                high=mid-1;
            }
        }}
        return high;
    }
}