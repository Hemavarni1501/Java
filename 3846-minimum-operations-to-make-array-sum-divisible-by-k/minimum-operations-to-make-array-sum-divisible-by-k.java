class Solution {
    public int minOperations(int[] nums, int k) {
        int s=0;
        for(int i:nums){
            s+=i;
        }
        if(s%k==0){
            return 0;
        }
        else {
            return s%k;
        }
    }
}