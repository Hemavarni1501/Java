class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        char[] path = new char[2 * n];
        dfs(res, path, 0, 0, 0, n);
        return res;
    }

    private void dfs(List<String> res, char[] path, int idx, int open, int close, int n) {
        if (idx == path.length) {
            res.add(new String(path));
            return;
        }

        if (open < n) {
            path[idx] = '(';
            dfs(res, path, idx + 1, open + 1, close, n);
        }

        if (close < open) {
            path[idx] = ')';
            dfs(res, path, idx + 1, open, close + 1, n);
        }
    }
}