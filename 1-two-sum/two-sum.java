class Solution {
    public int[] twoSum(int[] num, int k) {
        int n = num.length;
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = num[i];
            pairs[i][1] = i;
        }

        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));

        int left = 0, right = n - 1;
        while (left < right) {
            int sum = pairs[left][0] + pairs[right][0];
            if (sum == k) {
                return new int[]{pairs[left][1], pairs[right][1]};
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{};
    }
}