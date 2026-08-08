class Solution {
    public int longestValidParentheses(String s) {
        int max = 0;
        int[] stack = new int[s.length() + 1];
        int top = 0;

        stack[top++] = -1; // base index

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack[top++] = i;
            } else {
                top--; // pop
                if (top == 0) {
                    stack[top++] = i; // reset base
                } else {
                    int len = i - stack[top - 1];
                    if (len > max) max = len;
                }
            }
        }
        return max;
    }
}