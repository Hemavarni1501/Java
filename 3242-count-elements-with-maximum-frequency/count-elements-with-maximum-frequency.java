class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i], m.getOrDefault(nums[i],0)+1);
        }
        int c=0,max=0;
        for(int i:m.values()){
            if(max<i){
                max=i;
            }
        }
        for(int i:m.values()){
            if(i==max){
                c+=max;
            }
        }
        return c;
    }
}