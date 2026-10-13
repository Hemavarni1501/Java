class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length/2;
        for(int i=0;i<nums.length;i++){
            nums[i]*=nums[i];
        }
        Arrays.sort(nums);
        long s=0,m=0;
        for(int i=nums.length-1;i>=0;i--){
            if(i>=n){
                s+=nums[i];
            }else{
                m+=nums[i];
            }
        }
        return s-m;
    }
}