class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length(), n = s2.length();
        if (m + n != s3.length()) return false;

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        char[] c3 = s3.toCharArray();

        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        // initialize first row
        for (int j = 1; j <= n; j++) {
            dp[j] = dp[j - 1] && c2[j - 1] == c3[j - 1];
        }

        for (int i = 1; i <= m; i++) {
            dp[0] = dp[0] && c1[i - 1] == c3[i - 1];
            for (int j = 1; j <= n; j++) {
                dp[j] = (dp[j] && c1[i - 1] == c3[i + j - 1]) ||
                        (dp[j - 1] && c2[j - 1] == c3[i + j - 1]);
            }
        }

        return dp[n];
    }
}