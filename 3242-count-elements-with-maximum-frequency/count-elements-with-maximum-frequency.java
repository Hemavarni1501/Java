class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] count = new int[101];
        int maxFreq = 0;
        for (int num: nums) {
            count[num]++;
            if (count[num] > maxFreq) {
                maxFreq = count[num];
            }
        }
        int answer = 0;
        for (int i = 0; i <= 100; i++) {
            if (count[i] == maxFreq) {
                answer += maxFreq;
            }
        }
        return answer;
    }
}