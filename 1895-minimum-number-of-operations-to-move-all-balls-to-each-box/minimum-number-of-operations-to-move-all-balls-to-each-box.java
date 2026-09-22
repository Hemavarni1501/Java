class Solution1 {
    public int[] minOperations(String boxes) {
        int n = boxes.length();

        int[] res = new int[n];

        int balls = 0, moves = 0;

        for (int i = 0; i < n; i++) {
            res[i] += moves += balls;
            if (boxes.charAt(i) == '1') balls++;
        }

        balls = moves = 0;

        for (int i = n - 1; i >= 0; i--) {
            res[i] += moves += balls;
            if (boxes.charAt(i) == '1') balls++;
        }

        return res;
    }
}

class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] res = new int[n];

        solve(0, boxes, res, 0, 0);

        return res;
    }

    private int[] solve(int i, String boxes, int[] res,
                        int leftBalls, int leftMoves) {

        if (i == boxes.length())
            return new int[]{0, 0}; // {rightBalls, rightMoves}

        res[i] += leftMoves += leftBalls;
        if (boxes.charAt(i) == '1') leftBalls++;

        int[] right = solve(i + 1, boxes, res, leftBalls, leftMoves);

        res[i] += right[1] += right[0];
        if (boxes.charAt(i) == '1') right[0]++;

        return right;
    }
}