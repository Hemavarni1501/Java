class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> a=new LinkedHashSet<>();
        for(int i:nums){
            a.add(i);
        } int j=0;
        for(int i:a){
            nums[j++]=i;
        }
        return a.size();
    }
}