/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return convert(nums, 0, nums.length - 1);
    }

    private TreeNode convert(int[] nums, int low, int high) {
        // Base case: If the index range is invalid, return null.
        if (low > high) {
            return null;
        }

        // Find the middle element.
        // The expression low + (high - low) / 2 prevents potential integer overflow.
        int mid = low + (high - low) / 2;
        
        // 1. The middle element becomes the root.
        TreeNode root = new TreeNode(nums[mid]);

        // 2. Recursively build the left subtree from the left half.
        root.left = convert(nums, low, mid - 1);

        // 3. Recursively build the right subtree from the right half.
        root.right = convert(nums, mid + 1, high);

        return root;
    }
}