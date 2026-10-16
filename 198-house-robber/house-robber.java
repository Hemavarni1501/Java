class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        
        int prev2 = 0;
        int prev1 = 0;
        
        for (int num : nums) {
            int current = prev2 + num;
            if (prev1 > current) {
                current = prev1;
            }
            prev2 = prev1;
            prev1 = current;
        }
        
        return prev1;
    }
}