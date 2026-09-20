import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[][] result = new int[intervals.length][2];
        int count = 0;
        int[] currentInterval = intervals[0];
        result[count] = currentInterval;

        for (int i = 1; i < intervals.length; i++) {
            int currentStart = currentInterval[0];
            int currentEnd = currentInterval[1];
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            if (nextStart <= currentEnd) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                currentInterval = intervals[i];
                result[++count] = currentInterval;
            }
        }

        return Arrays.copyOf(result, count + 1);
    }
}