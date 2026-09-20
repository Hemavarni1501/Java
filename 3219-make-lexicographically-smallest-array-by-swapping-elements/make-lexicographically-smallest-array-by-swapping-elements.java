class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
         
        int[][] values = new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            values[i][0] = nums[i];
            values[i][1] = i;
        }
        Arrays.sort(values, (a,b) -> a[0] - b[0]);
        int start = 0;
        while(start< nums.length){
            int end = start;
            while(end+1<nums.length && values[end+1][0] - values[end][0] <=limit){
                end++;
            }
            int groupSize = end-start+1;
            int[] indexArr = new int[groupSize];
            for(int i=start;i<=end;i++){
                indexArr[i-start] = values[i][1];
            }
            Arrays.sort(indexArr);
            for(int i=0;i<groupSize;i++){
                nums[indexArr[i]] = values[i+start][0];
            }
            start = end+1;

        }
        return nums;
    }
}