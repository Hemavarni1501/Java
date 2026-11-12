class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int c=1,m1=1,d=1,m2=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                c=1; 
                d=1;
                continue;
            }
            if(nums[i-1]<nums[i]){
                c++;
            }else{
                c=1;
            }
                m1=m1>c?m1:c;
                
            
            if(nums[i-1]>nums[i]){
                d++;
            }
            else{
                d=1;
            }
            
                m2=m2>d?m2:d;
            
            
        }
        return m1>m2?m1:m2;
    }
}