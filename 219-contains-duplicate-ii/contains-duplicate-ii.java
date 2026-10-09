class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            
            // if element already exists in window → duplicate within k distance
            if (!window.add(nums[i])) {
                return true;
            }

            // maintain window size of exactly k
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }
        return false;
    }
}