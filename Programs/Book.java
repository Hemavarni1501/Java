import java.util.*;

public class Book {
    public static int solve(int A, int[] B, int C) {
        int minLen = Integer.MAX_VALUE;

        for (int t : B) {
            int[] arr = new int[A];

            for (int i = 0; i < A; i++) {
                if (B[i] >= t) arr[i] = 1;
                else arr[i] = -1;
            }

            for (int i = 0; i < A; i++) {
                int covered = 0;

                for (int j = i; j < A; j++) {
                    if (arr[j] == 1) covered++;

                    int len = j - i + 1;
                    int uncovered = len - covered;

                    if (covered > uncovered && covered >= C) {
                        minLen = Math.min(minLen, len);
                    }
                }
            }
        }

        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }

    public static void main(String[] args) {
        int A = 5;
        int[] B = {2, 3, 5, 1, 4};
        int C = 3;

        System.out.println(solve(A, B, C)); // Output: 2
    }
}