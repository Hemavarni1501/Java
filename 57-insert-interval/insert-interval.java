class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int[][] res = new int[n + 1][2];
        int i = 0;
        int idx = 0;

        while (i < n && intervals[i][1] < newInterval[0]) {
            res[idx++] = intervals[i++];
        }

        while (i < n && intervals[i][0] <= newInterval[1]) {
            if (intervals[i][0] < newInterval[0]) newInterval[0] = intervals[i][0];
            if (intervals[i][1] > newInterval[1]) newInterval[1] = intervals[i][1];
            i++;
        }
        res[idx++] = newInterval;

        while (i < n) {
            res[idx++] = intervals[i++];
        }

        int[][] result = new int[idx][2];
        System.arraycopy(res, 0, result, 0, idx);
        return result;
    }
}