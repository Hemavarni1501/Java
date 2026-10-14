import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        if (n1 == 0 || n2 == 0 || k <= 0) return result;

        // PriorityQueue with an initial capacity to avoid resizing overhead
        PriorityQueue<int[]> pq = new PriorityQueue<>(Math.min(k, n1), (a, b) -> a[0] - b[0]);

        // Push first k elements from nums1 paired with nums2[0]
        for (int i = 0; i < Math.min(n1, k); i++) {
            pq.offer(new int[]{nums1[i] + nums2[0], i, 0});
        }

        while (k-- > 0 && !pq.isEmpty()) {
            int[] curr = pq.poll();
            
            // Using Arrays.asList is slightly faster than manual add for small fixed sizes
            result.add(Arrays.asList(nums1[curr[1]], nums2[curr[2]]));

            // Only move forward in nums2 for the current nums1[i]
            if (curr[2] + 1 < n2) {
                pq.offer(new int[]{nums1[curr[1]] + nums2[curr[2] + 1], curr[1], curr[2] + 1});
            }
        }

        return result;
    }
}