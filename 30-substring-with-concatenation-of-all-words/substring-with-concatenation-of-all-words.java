class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        int n = s.length(), m = words.length;
        if (m == 0) return res;

        int wLen = words[0].length();
        int totalLen = m * wLen;
        if (n < totalLen) return res;

        HashMap<String, Integer> freq = new HashMap<>();
        for (String w : words)
            freq.put(w, freq.getOrDefault(w, 0) + 1);

        for (int offset = 0; offset < wLen; offset++) {
            int left = offset, count = 0;
            HashMap<String, Integer> window = new HashMap<>();

            for (int right = offset; right + wLen <= n; right += wLen) {
                String word = s.substring(right, right + wLen);

                if (freq.containsKey(word)) {
                    window.put(word, window.getOrDefault(word, 0) + 1);
                    count++;

                    while (window.get(word) > freq.get(word)) {
                        String leftWord = s.substring(left, left + wLen);
                        window.put(leftWord, window.get(leftWord) - 1);
                        left += wLen;
                        count--;
                    }

                    if (count == m) {
                        res.add(left);
                        String leftWord = s.substring(left, left + wLen);
                        window.put(leftWord, window.get(leftWord) - 1);
                        left += wLen;
                        count--;
                    }
                } else {
                    window.clear();
                    count = 0;
                    left = right + wLen;
                }
            }
        }
        return res;
    }
}