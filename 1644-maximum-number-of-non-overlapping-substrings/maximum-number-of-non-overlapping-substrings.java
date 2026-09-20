import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> maxNumOfSubstrings(String s) {
        int n = s.length();
        int[] first = new int[26];
        int[] last = new int[26];
        
        Arrays.fill(first, -1);
        Arrays.fill(last, -1);
        
        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'a';
            if (first[c] == -1) {
                first[c] = i;
            }
            last[c] = i;
        }
        
        List<int[]> intervals = new ArrayList<>();
        
        for (int i = 0; i < 26; i++) {
            if (first[i] != -1) {
                int right = getValidRightEnd(s, i, first, last);
                if (right != -1) {
                    intervals.add(new int[]{first[i], right});
                }
            }
        }
        
        intervals.sort((a, b) -> a[1] - b[1]);
        
        List<String> result = new ArrayList<>();
        int prevRight = -1;
        
        for (int[] interval : intervals) {
            if (interval[0] > prevRight) {
                result.add(s.substring(interval[0], interval[1] + 1));
                prevRight = interval[1];
            }
        }
        
        return result;
    }
    
    private int getValidRightEnd(String s, int charIdx, int[] first, int[] last) {
        int left = first[charIdx];
        int right = last[charIdx];
        
        for (int j = left; j <= right; j++) {
            int c = s.charAt(j) - 'a';
            
            if (first[c] < left) {
                return -1; 
            }
            right = Math.max(right, last[c]);
        }
        
        return right;
    }
}