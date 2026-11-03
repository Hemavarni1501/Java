class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int m=nums[nums.length-1];
        int s=0;
        for(int i=0;i<nums.length-1;i++){
            s+=(m-nums[i]);
        }
        return s;
    }
}