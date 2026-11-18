class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0, sumB = 0;
        for (int a : A) sumA += a;
        for (int b : B) sumB += b;

        int delta = (sumA - sumB) / 2;

        // Using a boolean array to mark values in A (faster than HashSet)
        boolean[] mark = new boolean[200001]; // max value 100000
        for (int a : A) mark[a] = true;

        for (int b : B) {
            int target = b + delta;
            if (target >= 0 && target < mark.length && mark[target]) {
                return new int[]{target, b};
            }
        }

        return new int[0]; // guaranteed solution exists
    }
}