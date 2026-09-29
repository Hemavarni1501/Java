class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) return res;
        char[] arr = s.toCharArray();
        dfs(arr, 0, new StringBuilder(), 0, res);
        return res;
    }

    private void dfs(char[] arr, int index, StringBuilder sb, int segment, List<String> res) {
        if (segment > 4) return;
        if (index == arr.length && segment == 4) {
            res.add(sb.toString());
            return;
        }

        int len = sb.length();
        int maxLen = Math.min(3, arr.length - index);
        for (int l = 1; l <= maxLen; l++) {
            if (l > 1 && arr[index] == '0') break; // leading zero
            int val = 0;
            for (int k = 0; k < l; k++) {
                val = val * 10 + (arr[index + k] - '0');
            }
            if (val > 255) break;

            if (segment > 0) sb.append('.');
            sb.append(safeSubstring(arr, index, l));

            dfs(arr, index + l, sb, segment + 1, res);
            sb.setLength(len); // backtrack
        }
    }

    private String safeSubstring(char[] arr, int start, int len) {
        return new String(arr, start, len);
    }
}