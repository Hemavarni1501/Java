class Solution {
    public boolean canJump(int[] nums) {
        int reachable = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i > reachable) {
                return false;
            }
            if (i + nums[i] > reachable) {
                reachable = i + nums[i];
            }
            if (reachable >= n - 1) {
                return true;
            }
        }
        return true;
    }
}