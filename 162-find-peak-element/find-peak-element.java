class Solution {
    public int findPeakElement(int[] nums) {
        
        int m=Integer.MIN_VALUE; int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>m){
                m=nums[i]; c=i;
            }
        }
        return c;
    }
}