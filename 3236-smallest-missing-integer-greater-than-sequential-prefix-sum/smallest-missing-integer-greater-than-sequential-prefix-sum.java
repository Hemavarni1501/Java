class Solution {
    public int missingInteger(int[] nums) {
        int s=0,c=0;
        if(nums.length==1){
            return nums[0]+1;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1]){
                s+=nums[i]; c++;
            }
            else{
                s+=nums[i];
                break;
            }
            if(i+1==nums.length-1){
                s+=nums[i+1];
                return s++;
            }
        }
        Arrays.sort(nums); int i=c;
        while(i<nums.length){
            if(nums[i]==s){
                i++; s++;
            }
            else{
                i++;
            }
        }
        return s;
    }
}