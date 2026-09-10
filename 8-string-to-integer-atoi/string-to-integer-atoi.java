class Solution {
    public int myAtoi(String s) {
        int j = 0;
        int m = 1;
        String t = s.trim();
        if (t.length() > 0) {
            String ans = "";
            if (t.charAt(0) == '-' || t.charAt(0) == '+') {
                m = t.charAt(0) == '-' ? -1 : 1;
            }
            while (j < t.length()) {
                if (!Character.isDigit(t.charAt(j))) {
                    if (j == 0 && (t.charAt(j) == '-' || t.charAt(j) == '+')) {
                        j++;
                        continue;
                    }
                    break;
                } else {
                    ans += t.charAt(j++);
                }
            }
            long a = 0;
            for (int i = 0; i < ans.length(); i++) {
                int d = ans.charAt(i) - '0';
                a = (a * 10) + d;
                if (m == 1 && a >= Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (m == -1 && -a <= Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
            }
            if (m == -1) {
                a = -a;
            }
            return (int) a;
        }
        return 0;
    }
}