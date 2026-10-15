class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n < 3) return 0;

        int left = 0;
        int right = n - 1;
        int water = 0;
        
        // Find initial boundaries to skip zeros or increasing/decreasing slopes at edges
        while (left < right && height[left] <= height[left + 1]) left++;
        while (left < right && height[right] <= height[right - 1]) right--;

        int leftMax = 0;
        int rightMax = 0;

        while (left < right) {
            int lVal = height[left];
            int rVal = height[right];

            if (lVal < rVal) {
                if (lVal >= leftMax) {
                    leftMax = lVal;
                } else {
                    water += leftMax - lVal;
                }
                left++;
            } else {
                if (rVal >= rightMax) {
                    rightMax = rVal;
                } else {
                    water += rightMax - rVal;
                }
                right--;
            }
        }

        return water;
    }
}