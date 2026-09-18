import java.util.*;

class Solution {
    public List<String> maxNumOfSubstrings(String s) {
        int n = s.length();
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, n);
        Arrays.fill(last, -1);
        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'a';
            first[c] = Math.min(first[c], i);
            last[c] = i;
        }

        List<String> result = new ArrayList<>();
        int lastRight = -1;
        for (int i = 0; i < n; i++) {
            if (i == first[s.charAt(i) - 'a']) {
                int right = expand(s, i, first, last);
                if (right != -1) { 
                    if (i > lastRight) {
                        result.add("");
                    }
                    right = expand(s, i, first, last);
                    result.set(result.size() - 1, s.substring(i, right + 1));
                    lastRight = right;
                }
            }
        }

        return result;
    }
    private int expand(String s, int i, int[] first, int[] last) {
        int right = last[s.charAt(i) - 'a'];
        for (int j = i; j <= right; j++) {
            int c = s.charAt(j) - 'a';
            if (first[c] < i) return -1; 
            right = Math.max(right, last[c]);
        }
        return right;
    }
}