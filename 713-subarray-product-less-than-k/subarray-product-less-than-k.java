class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int n=nums.length;
        int c=0,p=1;
        for(int i=0,j=0;j<n;j++){
            p*=nums[j];
            while(p>=k){
                p/=nums[i];
                i++;
            }
            c+=j-i+1;
        }
        return c;
    }
}